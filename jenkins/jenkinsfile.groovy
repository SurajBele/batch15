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
                withSonarQubeEnv( installationName: 'sonar-server', credentialsId: 'sonar-token') {
                sh '/opt/apache-maven-3.9.12/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=myproject'
}
              
                echo "testing success"
            }
        }
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: 'tomcat-pass', path: '', url: 'http://13.201.63.76:8080')], contextPath: '/', war: '**/*.war'
                echo "deploy success"
            }
        }
    }
}