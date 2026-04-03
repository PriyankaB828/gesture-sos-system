pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/PriyankaB828/gesture-sos-system.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'ls'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}
