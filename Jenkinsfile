pipeline {
    environment {
        IMAGE_PORT=8080
        IMAGE_NAME="library:1.0.${BUILD_NUMBER}"
    }
    options {
        disableConcurrentBuilds()
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
                sh "mvn -B clean deploy"
            }
        }
        stage('Build Image') {
            steps {
                agent {
                    dockerfile true
                }
            }
        }
    }
}