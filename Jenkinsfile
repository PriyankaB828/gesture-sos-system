pipeline {
    agent any

    stages {

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t gesture-sos .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8085:8080 --name gesture-sos-container gesture-sos || true'
            }
        }

    }
}
