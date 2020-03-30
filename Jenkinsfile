pipeline {
    agent any
    
    environment {
        KEYSTORE = credentials('kieker-irl-key')
	UPDATESITE = 'repo@repo.se.internal/var/www/html'
	DESTINATION = 'snapshot'
    }
    
    stages {
        stage('Cleanup') {
		steps {
			sh 'git clean -xffd'
//			sh 'rm -rf *'
//			sh 'git clone https://github.com/kieker-monitoring/instrumentation-languages.git'
//			sh 'mv instrumentation-languages/* .'
		}
	}
	stage('Build') {
		steps {
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
