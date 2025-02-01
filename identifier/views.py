from django.shortcuts import render
from django.conf import settings
from django.core.files.storage import default_storage
from .breed_predictor import predict
from django.conf import settings
import os
# Create your views here.
def index(request):
    if request.method == "POST":
        image = request.FILES.get("image")
        file_path = default_storage.save(image.name, image)
        full_file_path = os.path.join(os.path.join(settings.BASE_DIR, 'media'),file_path)
        prediction = predict(full_file_path)
        image_file_path= settings.MEDIA_URL+file_path
        # default_storage.delete(file_path)
        return render(request, "result.html",{"prediction":prediction,"image_path": image_file_path})
    return render(request, "index.html")