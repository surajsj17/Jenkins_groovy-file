pipeline {
    agent any

    tools {
        terraform 'terraform'
    }

    stages {
        stage('checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/surajsj17/terraform-sj.git'
            }
        }

        stage('terraform - init') {
            steps {
                sh 'terraform init'
            }
        }

        stage('terraform - validate') {
            steps {
                sh 'terraform validate'
            }
        }

        stage('terraform - plan') {
            steps {
                sh "terraform plan -var-file=${profile}.tfvars"
            }
        }

        stage('terraform - action') {
            steps {
                sh "terraform ${action} -var-file=${profile}.tfvars -auto-approve"
            }
        }
    }
}
