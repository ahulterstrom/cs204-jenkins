pipeline {
    agent any

    stages {
        stage('build'){
            steps {
                sh'echo Compile'
            }
        }

        stage ('test') {
            steps {
                sh 'echo Test'
            }
        }

        stage ('deploy'){
            steps {
                sh 'echo Deploy'
            }
        }
    }
}