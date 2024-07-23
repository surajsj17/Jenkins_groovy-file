pipeline {
    agent any
    stages {
        stage('gitpullrepo') {
            steps {
                script {
                    git branch: 'main', credentialsId: '1', url: "$repo"
                }
            }
        }
        stage('docker build') {
            steps {
                script {
                    bat "docker build -t surajsj17/webdev:01 ."
                }
            }
        }
        stage('docker push to hub') {
            steps {
                script {
                    bat "docker push surajsj17/webdev:01"
                }
            }
        }   
    }
}
