pipeline {
	agent any

	environment {
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
						sh 'rm -rf ${WORKSPACE}/kieker.develop.repository/target'
						sh 'find ${WORKSPACE} -name 'target' -exec rm {} \;'
						sh 'mvn -Dmaven.repo.local=${WORKSPACE}/ws-repo --batch-mode compile'
					}
				}
				stage('Test') {
					steps {
						sh 'mvn -Dmaven.repo.local=${WORKSPACE}/ws-repo --batch-mode test'
					}
				}
				stage('Check') {
					steps {
						sh 'mvn -Dmaven.repo.local=${WORKSPACE}/ws-repo --batch-mode package checkstyle:checkstyle pmd:pmd -Dworkspace=' + env.WORKSPACE // spotbugs:spotbugs
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
					environment {
						KEYSTORE = credentials('kieker-irl-key')
					}
					steps {
						sh 'mvn -Dmaven.repo.local=${WORKSPACE}/ws-repo -DskipTests -P snapshot --settings settings.xml --batch-mode -Dkeystore=${KEYSTORE} -Dupdate-site-url=${UPDATE_SITE_URL} install'
					}
				}
			}
		}
	}
}
