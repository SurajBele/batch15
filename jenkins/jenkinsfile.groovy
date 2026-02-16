pipeline {
    agent {
        label 'node1'
    }
    stages {
        stage('pull') {
            steps {
                git branch: 'main', url: 'https://github.com/SurajBele/studentdata.git'
                echo "pull success"
            }
        }
        stage('Build') {
            steps {
                sh '/opt/apache-maven-3.9.12/bin/mvn clean package'
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