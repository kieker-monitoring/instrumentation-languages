#!/bin/bash

for I in `ls lib` ; do
	ARTIFACT=`echo $I | sed 's/^\(.*\)_.*$/\1/'`
	VERSION=`echo $I | sed 's/^.*_\(.*\)\.jar$/\1/'`
#	echo $I
#	echo $ARTIFACT
#	echo $VERSION
	mvn org.apache.maven.plugins:maven-install-plugin:2.3.1:install-file -Dfile="lib/$I" \
		-DgroupId=local -DartifactId=$ARTIFACT -Dpackaging=jar -Dversion=$VERSION \
		-DlocalRepositoryPath=mvn-repo
done
