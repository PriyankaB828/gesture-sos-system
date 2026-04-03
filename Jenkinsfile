pipeline {
    agent any

    stages {

        stage('Build Project') {
            steps {
                sh '''
                docker run --rm \
                -v $PWD:/app \
                -w /app \
                maven:3.9.9-eclipse-temurin-17 \
                mvn clean package
                '''
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t gesture-sos-system .'
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                docker stop gesture-sos || true
                docker rm gesture-sos || true
                docker run -d -p 8080:8080 --name gesture-sos gesture-sos-system
                '''
            }
        }

    }
}