pipeline {
    agent any
    stages {
        stage('Parallelbuild') {
            steps {
                parallel(
                    "Build-1": {
                        script {
                            bat 'echo This is building - 1 project code'
                        }
                    },
                    "Build-2": {
                        script {
                            bat 'echo This is building - 2 project code'
                        }
                    }
                )
            }
        }
        stage('Test') {
            steps {
                script {
                    bat 'echo This is Testing project code'
                }
            }
        }
        stage('deployed') {
            steps {
                script {
                    bat 'echo This is deployed project code'
                }
            }
        }
    }
}
