pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/JarkkoKarki/OTP1Assignments.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
                echo 'building success'
            }
        }

        stage('Test') {
            steps {
                echo 'running tests'
                bat 'mvn test jacoco:report'
                bat 'dir target/s'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'

            publishHTML({
                reportDir: 'target/site/jacoco'
                reportFiles: 'index.html'
                reportName: 'JaCoCo Coverage Report'
                allowMissing: true
                alwaysLinkToLastBuild: true
                keepAll: true
            })
        }
    }
}