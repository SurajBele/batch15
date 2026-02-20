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
              sh '''/opt/apache-maven-3.9.12/bin/mvn clean verify sonar:sonar \\
                    -Dsonar.projectKey=myproject \\
                    -Dsonar.host.url=http://43.205.98.76:9000 \\
                    -Dsonar.login=sqp_7c6db7527fe810de171368b8c2dad0d7e038cd6d
'''
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