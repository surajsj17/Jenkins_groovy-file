pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                script{
                    
                    bat 'echo This is building project code'
                }           
            }
        }
        stage('Tested'){
            steps{
                script{
                    bat 'echo This is Testing project code'
                }           
            }
        }
        stage('deployed'){
            steps{
                script{
                    bat 'echo This is deployed project code'
                }           
            }
        }
    }
}