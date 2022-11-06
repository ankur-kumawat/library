pipeline {
    environment {
        IMAGE_PORT=8080
        IMAGE_NAME="library:1.0.${BUILD_NUMBER}"
    }
    options {
        disableConcurrentBuilds()
    }
    agent {
        docker {
            image 'maven:3.8.6'
        }
    }
    stages {
        stage('Set Pipeline Name') {
            steps {
                script {
                    currentBuild.displayName="Library"
                }
            }
        }
        stage('Build Maven') {
            steps {
                sh "mvn -B clean package"
//                 container('maven'){
//                     maven(command: "-B clean deploy")
//                 }
            }
        }
        stage('Build Docker Image') {
            steps {
                sh "docker build -t ankur89kumawat/library:latest ."
            }
        }
    }
}