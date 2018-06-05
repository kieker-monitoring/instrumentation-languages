#!groovy

DOCKER_IMAGE_NAME = "reinerjung/kieker.maven"
LOCAL_PATH = "/opt/irl/instrumentation-languages"
KDT_ID = "kdt-jenkins"
REPO_HOST = "192.168.48.16"

node {
	stage ('Checkout') {
		timeout(time: 3, unit: 'MINUTES') {	// typically finished in under 1 min.
			checkout scm
		}
	}

	stage ('Prepare') {
		sh 'docker run --rm -u `id -u` -v ' + env.WORKSPACE + ':' + LOCAL_PATH + ' ' + DOCKER_IMAGE_NAME + ' /bin/bash -c "cd ' + LOCAL_PATH + '; mvn -s settings.xml -B clean"'
	}

	stage ('Compile and Deploy') {
		withCredentials([file(credentialsId: KDT_ID, variable: 'kdt_key_file')]) {
			sh 'docker run --rm -u `id -u` -v ' + env.WORKSPACE + ':' + LOCAL_PATH + ' ' + DOCKER_IMAGE_NAME + ' /bin/bash -c "cd ' + LOCAL_PATH + '; mvn -X -s settings.xml -B package -Dkeystore=${kdt_key_file} -Dupdatesite=repo@' + REPO_HOST + '/var/www/html"'
		}
	}
}

