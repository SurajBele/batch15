pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git branch: 'main', url: 'https://github.com/SurajBele/studentdata.git'
                echo "pull success"
            }
        }
        stage('Build') {
            steps {
                echo " build success"
            }
        }
        stage('Test') {
            steps {
                echo "testing success"
            }
        }
        stage('Deploy') {
            steps {
                echo "deploy success"
            }
        }
    }
}