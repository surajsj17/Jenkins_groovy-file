pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    try {
                        if (isUnix()) {
                            sh 'echo Build is done'
                        } else {
                            bat 'echo Build is done'
                        }
                    } catch (Exception e) {
                        echo "Build failed: ${e.getMessage()}"
                        error "Build failed"
                    }
                }
            }
        }
        stage('Test') {
            when {
                    expression {
                      choice == 'Testing'
                    }
            }
            steps {
                script {
                    try {
                        if (isUnix()) {
                            sh 'echo Test is done'
                        } else {
                            bat 'echo Test is done'
                        }
                    } catch (Exception e) {
                        echo "Testing failed ${choice}: ${e.getMessage()}"
                        error "Testing failed"
                    }
                }
            }
        }
        stage('Deployed') {
            when {
                    expression {
                      choice == 'Production'
                    }
            }
            steps {
                script {
                    try {
                        if (isUnix()) {
                            sh 'echo Deployed is done'
                        } else {
                            bat 'echo Deployed is done'
                        }
                    } catch (Exception e) {
                        echo "Deployment failed: ${e.getMessage()}"
                        error "Deployment failed"
                    }
                }
            }
        }
    }
}
