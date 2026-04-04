pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/PriyankaB828/gesture-sos-system.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t gesture-sos .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker stop gesture-sos-container || true'
                sh 'docker rm gesture-sos-container || true'
                sh 'docker run -d -p 9090:8080 --name gesture-sos-container gesture-sos'
            }
        }
    }
}