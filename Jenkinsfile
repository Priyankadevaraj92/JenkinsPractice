pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build and Package') {
            steps {
                sh './mvnw clean install -DskipTests'
            }
        }
        
        stage('Build Docker Image') {
            steps {
                script {
                    def image = docker.build('employee-service:priyankadevaraj/jenkins-employee-service:latest', '.')
                    image.inside {
                        sh 'echo "Running inside Docker container"'
                    }
                }
            }
        }
        
        stage('Run Docker Container') {
            steps {
                sh 'docker run -d -p 8080:8080 employee-service:priyankadevaraj/jenkins-employee-service:latest'
            }
        }
    }
    
    post {
        success {
            echo "Docker images pushed successfully to DockerHub"
        }
        failure {
            echo "Failed pushing Docker images to DockerHub"
        }
    }
}
