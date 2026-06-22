# Gesture-Based SOS Alert System using DevOps & Real-Time Processing

## 📖 Project Overview
The Gesture-Based SOS Alert System is a real-time safety application that allows users to trigger emergency alerts using hand gestures instead of voice commands or physical interaction.

The system uses **MediaPipe (computer vision)** on the frontend to detect predefined SOS gestures through webcam input, and a **Spring Boot REST API** backend to validate the gesture and trigger an appropriate alert response.

This solution can be useful in emergency situations where a person may be unable to speak or access a mobile device.

---

# 🚀 Features
* Real-time hand gesture detection using MediaPipe (21-point hand landmark tracking)
* Browser-based webcam input — no extra software needed
* SOS gesture recognition (Wave, Thumbs up, Fist, Peace)
* REST API backend built with Spring Boot
* Manual gesture input option (buttons + text field)
* Dockerized backend application
* Automated CI/CD pipeline using Jenkins
* Responsive web frontend (HTML, CSS, JavaScript)

---

# 🛠️ Tech Stack

## Frontend
* HTML, CSS, JavaScript
* MediaPipe Hands (Google's open-source hand tracking library)

## Backend
* Java 17
* Spring Boot
* Maven

## DevOps & Tools
* Docker
* Jenkins (CI/CD pipeline)
* GitHub

---

# 🏗️ Architecture Flow

```
Camera Input (Browser)
        ↓
MediaPipe Hands (JS) — detects hand landmarks
        ↓
Gesture Classification (Wave / Fist / Thumbs up / Peace)
        ↓
REST API call → POST /gesture
        ↓
Spring Boot Backend (GestureController.java)
        ↓
Gesture Validation Logic
        ↓
SOS Alert Response Returned
        ↓
Displayed on Frontend UI
```

---

# ⚙️ How It Works
1. The webcam captures a live video feed directly in the browser.
2. MediaPipe Hands detects 21 hand landmark points in real time.
3. A simple rule-based classifier identifies the gesture (wave, fist, thumbs up, peace) from finger positions.
4. The detected gesture name is sent to the backend via a POST request to `/gesture`.
5. The Spring Boot backend validates the gesture and builds a response.
6. If the gesture matches the SOS pattern (wave), an emergency alert response is returned and displayed.

---

# 📂 Project Structure
```
gesture-sos-system/
│
├── Jenkinsfile
├── Dockerfile
├── pom.xml
├── README.md
│
├── src/
│   └── main/
│       ├── java/com/sos/
│       │   ├── GestureServiceApplication.java
│       │   └── GestureController.java
│       └── resources/
│           └── static/
│               └── index.html      ← frontend UI
│
├── alert-service/
├── pattern-service/
├── validation-service/
└── target/                          ← generated after Maven build
```

---

# ▶️ Setup Instructions

## 1. Clone Repository
```bash
git clone https://github.com/PriyankaB828/gesture-sos-system.git
cd gesture-sos-system
```

## 2. Build the project with Maven
```bash
mvn clean package -DskipTests
```

## 3. Build Docker image
```bash
docker build -t gesture-sos .
```

## 4. Run the container
```bash
docker run -d -p 9090:8080 --name gesture-sos-container gesture-sos
```

## 5. (Optional) Run via Jenkins CI/CD pipeline
A `Jenkinsfile` is included which automates steps 2–4 automatically on every code push:
```
Checkout Code → Build Maven Project → Build Docker Image → Run Container
```

## 6. Open the app
```
http://localhost:9090
```

---

# 📸 Screenshots
<img width="1163" height="732" alt="UI Screenshot 1" src="https://github.com/user-attachments/assets/a47bc596-f459-49d4-98d4-9a4c1c931197" />
<img width="1163" height="732" alt="UI Screenshot 2" src="https://github.com/user-attachments/assets/5202b882-ab16-4399-8967-484cd494bc11" />
<img width="1350" height="893" alt="Jenkins Pipeline Screenshot" src="https://github.com/user-attachments/assets/44e6fbdb-bffb-4fca-bd04-e457662ca071" />

---

# 🔮 Future Enhancements
* SMS / Email alert integration
* Live location sharing
* Mobile application support
* More gesture types and custom training
* Emergency contact integration
* Cloud deployment (AWS / Azure)
* Persistent storage of alert history (database)

---

# ✅ Advantages
* Hands-free emergency triggering
* Real-time gesture processing in-browser
* No external API key required (MediaPipe is open-source)
* Fully automated build & deployment via Jenkins
* User-friendly web interface
