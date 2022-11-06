pipeline {
    environment {
        IMAGE_PORT=8080
        IMAGE_NAME="library:1.0.${BUILD_NUMBER}"
    }
    options {
        disableConcurrentBuilds()
    }
    agent {
        dockerfile true
    }
    stages {
        stage('Set Pipeline Name') {
            steps {
                script {
                    currentBuild.displayName="Library"
                }
            }
        }
        stage('Build Image') {
            steps {
                container('maven'){
                    maven(command: "-B clean deploy")
                }
            }
        }
    }
}