pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/PriyankaB828/gesture-sos-system.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t gesture-sos .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8000:8000 gesture-sos'
            }
        }

    }
}
