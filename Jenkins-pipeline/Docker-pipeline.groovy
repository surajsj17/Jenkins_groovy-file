pipeline{
    agant any
    // tools{}
    stages{
        stage ('build Maven'){
            steps{

            }
        }
        stage ('Build docker images'){
            steps{
                script{
                    sh 'docker build -t surajsj17/devops-integration:my-data .'
                }
            }
        }
        stage ('docker image push'){
            steps{
                script{

                    sh'docker loging -u surajsj17 -p ${dockerhubpwd}'
                }
                sh ' docker push surajsj17/devops-integration:my-data'
            }
        }   
    }
}