from flask import Flask, render_template, request
from werkzeug.utils import secure_filename
from breed_predictor import predict
import os

app = Flask(__name__)

upload_folder = 'static/images'
app.config['upload_folder'] = upload_folder

@app.route(rule="/", methods=["POST", "GET"])
def index():
    if request.method=="POST":
        image = request.files["image"]
        image_name = secure_filename(image.filename)
        image_path = os.path.join(app.config['upload_folder'], image_name)
        image.save(image_path)
        prediction = predict(image_path)
        return render_template("result.html.j2",prediction=prediction)
    else:
        return render_template("index.html.j2")
    

app.run(host="0.0.0.0",debug=True)