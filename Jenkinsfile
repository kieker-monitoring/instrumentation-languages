pipeline {
    agent any
    
    environment {
        KEYSTORE = credentials('kieker-irl-key')
	UPDATESITE = 'repo@repo.se.internal/var/www/html'
	DESTINATION = 'snapshot'
    }
    
    stages {
        stage('Build') {
		steps {
			sh 'find . -name "target" -exec rm -rf {} \\;'
			sh 'mvn clean'
			sh 'mvn compile'
		}
        }
        stage('Test') {
		steps {
	            sh 'mvn test'
	        }
        }
        stage('Deploy') {
		steps {
		sh 'mvn --settings settings.xml -Dkeystore=${KEYSTORE} -Dupdatesite=${UPDATESITE} -Ddestination=${DESTINATION} package'
            }
        }
    }
}
