pipeline {
    agent any

    stages {

        stage('Clone Repo') {
            steps {
                git 'https://github.com/PriyankaB828/gesture-sos-system.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t gesture-sos .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8085:8080 gesture-sos'
            }
        }

    }
}
