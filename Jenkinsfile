pipeline {
	agent any 

	environment {
		KEYSTORE = credentials('kieker-irl-key')
		UPDATE_SITE_URL = "sftp://repo@repo.se.internal/var/www/html/kdt"
		DESTINATION = 'snapshot'
	}

	stages {
		stage('Cleanup') {
			steps {
				sh 'git clean -xffd -e "ws-repo/**"'
			}
		}
		stage('Main') {
			agent {
				docker {
					image "prefec2/jdk11-maven-363-gradle671"
					alwaysPull false
				}
			}
			stages {
				stage('Build') {


					steps {
						sh 'mvn --batch-mode compile'
					}
				}
				stage('Test') {
					steps {
						sh 'mvn --batch-mode test'
					}
				}
				stage('Check') {
					steps {
						sh 'mvn --batch-mode package checkstyle:checkstyle pmd:pmd -Dworkspace=' + env.WORKSPACE // spotbugs:spotbugs
					}
					post {
						always {
							recordIssues enabledForFailure: true, tools: [mavenConsole(), java(), javaDoc()]
							recordIssues enabledForFailure: true, tool: checkStyle()
			//					recordIssues enabledForFailure: true, tool: spotBugs()
							recordIssues enabledForFailure: true, tool: pmdParser()
						}
					}
				}
				stage('Update Repository') {
					steps {
						sh 'mvn --settings settings.xml --batch-mode -Dkeystore=${KEYSTORE} -Dupdate-site-url=${UPDATE_SITE_URL} -Ddestination=${DESTINATION} install'
					}
				}
			}
		}
	}
}
