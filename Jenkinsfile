pipeline {
	agent any

	environment {
		UPDATE_SITE_URL = "sftp://repo@repo.se.internal/kdt"
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
						sh 'rm -rf ${WORKSPACE}/kieker.develop.al/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.al.feature/target'

						sh 'rm -rf ${WORKSPACE}/kieker.develop.al.generator.c/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.al.generator.java/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.al.generator.perl/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.al.handler.java/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.al.handler.pcm/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.al.tests/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.al.ui/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.al.ide/target'
												
						sh 'rm -rf ${WORKSPACE}/kieker.develop.repository/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.feature/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.cli/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.cli.feature/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.cli.site/target'
												
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.generator.c/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.generator.delphi/target'

						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.generator.java/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.generator.java.tests/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.generator.perl/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.generator.python/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.ide/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.tests/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.rl.ui/target'
												
						sh 'rm -rf ${WORKSPACE}/kieker.develop.semantics/target'
						sh 'rm -rf ${WORKSPACE}/kieker.develop.semantics.java/target'
						sh 'rm -rf ${WORKSPACE}/kieker.architecture.visualization/bin'
						sh 'rm -rf ${WORKSPACE}/kieker.architecture.visualization/target'
						sh 'rm -rf ${WORKSPACE}/kieker.architecture.visualization.feature/target'

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
					//	sh 'mvn -X -Dmaven.repo.local=${WORKSPACE}/ws-repo -DskipTests -P snapshot --settings settings.xml --batch-mode -Dkeystore=${KEYSTORE} -Dupdate-site-url=${UPDATE_SITE_URL} install'
						sh '/usr/bin/sftp -i ${KEYSTORE} -o User=repo -o StrictHostKeyChecking=no -b ${WORKSPACE}/upload.sftp ${UPDATE_SITE_URL}/${DESTINATION}'
					}
				}
			}
		}
	}
}
