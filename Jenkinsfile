pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout your Spring Boot application code from the repository
                checkout scm
            }
        }
        
        stage('Build and Package') {
            steps {
                // Build the Spring Boot application using Maven
              //  sh 'mvn clean package'  
                sh './mvnw clean install -DskipTests' 
                sh 'docker compose up –build'
            }
        }
        
        stage('Build Docker Image') {
            steps {
                // Build a Docker image for your Spring Boot app
                script {
                  //  def image = docker.build('your-image-name:your-tag', '.')
                  def image = docker.build('employee-service:priyankadevaraj
/
jenkins-employee-service', '.')
                //    docker tag employee-service priyankadevaraj/fscc-employee-service
                    image.inside {
                        sh 'echo "Running inside Docker container"'
                    }
                }
            }
        }
        
        stage('Run Docker Container') {
            steps {
                // Run the Docker container
                sh 'docker run -d -p 3306:3306 employee-service:priyankadevaraj
/
jenkins-employee-service'
            }
        }
    }
    
    post {
        success {
            // Notify or perform additional actions on success
            "Docker images pushed succesfully to DockerHub"
        }
        failure {
            // Notify or handle failures
             "Failed pushing Docker images to DockerHub"

        }
    }
}
