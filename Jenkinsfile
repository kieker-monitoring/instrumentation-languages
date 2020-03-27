pipeline {
    agent any
    
    environment {
        KEYSTORE = credentials('kieker-irl-key')
    }
    
    stages {
        stage('Build') {
	       	steps {
            	sh 'mvn clean compile'
        	}
        }
        stage('Test') {
	       	steps {
	            sh 'mvn test'
	        }
        }
        stage('Deploy') {
        	steps {
            	sh 'mvn --settings settings.xml -Dkeystore=${KEYSTORE} package'
            }
        }
    }
}