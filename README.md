# Dog Breed Classification Web App

## Overview
This project is a **deep learning-powered web application** that classifies dog breeds from user-uploaded images. Built using **TensorFlow, Keras, and Django**, the model is trained on the **Stanford Dog Dataset (120 breeds)** using **EfficientNetB0**, achieving **87.73% accuracy and 90% precision**.

## Features
- **Deep Learning Model**: Uses **EfficientNetB0** for high-accuracy dog breed classification.
- **Top 3 Predictions**: Displays the top 3 predicted breeds with their probabilities.
- **Django Web Application**: Allows users to upload an image and get breed predictions.
- **Data Augmentation**: Enhances model generalization and performance.

## Tech Stack
- **Backend**: Django, TensorFlow, Keras
- **Frontend**: HTML, CSS, Bootstrap

## Installation
### Prerequisites
- Python 3.x
- Virtual environment (recommended)

### Steps
```bash
# Clone the repository
git clone https://github.com/yourusername/dog-breed-classifier.git
cd dog-breed-classifier

# Create a virtual environment
python -m venv venv
source venv/bin/activate  # On Windows use 'venv\Scripts\activate'

# Install dependencies
pip install -r requirements.txt

# Start the Django server
python manage.py runserver
```

## Usage
1. Open the web app in a browser: `http://127.0.0.1:8000/`
2. Upload an image of a dog.
3. View the top 3 predicted breeds with their probabilities.

## Model Details
- **Architecture**: EfficientNetB0
- **Dataset**: Stanford Dog Dataset (120 breeds)
- **Performance**:
  - Accuracy: **87.73%**
  - Precision: **90%**
  
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss.

## Contact
For any inquiries, feel free to reach out!
- **GitHub**: [VikasAdhikari07](https://github.com/VikasAdhikari07)
- **Email**: vikasadhikari067@gmail.com

