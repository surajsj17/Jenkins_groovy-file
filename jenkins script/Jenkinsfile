def gv
pipeline{
    agent any
    choice (name : 'VERSION', choices: ['1','2','3'] , description:'')
    stages{
        stage ('init'){
            steps {
                script{
                        gv = load "script.groovy"
                }         
            }
        }
        stage ('Build'){
            steps{
                script{
                    gv.Build()
                }
            }
        }
        stage ('test'){
            steps{
                script{
                    gv.Test()
                }
            }
        }
        stage ('Deployed'){
            steps{
                script{
                    gv.Deployed()
                }
            }
        }
    }

}
