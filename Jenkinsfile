pipeline {
    agent any
    tools {
        maven 'apache maven 3.6.3'
        jdk 'JDK 8'
    }
    stages {
        stage ('Clean') {
            steps {
                sh 'mvn clean'
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn compile'
            }
        }

        stage ('Short Tests') {
            steps {
                sh 'mvn -Dtest=CalculatorTest test'
            }
        }

        stage ('Long Tests') {
            steps {
                sh 'mvn -Dtest=CalculatorTestThorough test'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }

        stage ('Package') {
            steps {
                sh 'mvn package'
                archiveArtifacts artifacts: 'src/**/*.java'
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

    }
}
