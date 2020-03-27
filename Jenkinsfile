pipeline {
    agent any
    
    environment {
        KEYSTORE = credentials('kieker-irl-key')
    }
    
    stages {
        stage('Build') {
           sh 'mvn clean compile'
        }
        stage('Test') {
           sh 'mvn test'
        }
        stage('Deploy') {
           sh 'mvn --settings settings.xml -Dkeystore=${KEYSTORE} package'
        }
    }
}