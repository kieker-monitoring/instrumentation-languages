#!/bin/bash
#
# Create archive for IRL compiler and copy the update site to lastSuccessfulBuild

export LAST_SUCCESSFUL_BUILD="$WORKSPACE/../lastSuccessfulBuild/"
export IRL_COMPILER="$LAST_SUCCESSFUL_BUILD/irl-compiler"
export UPDATE_SITE="$LAST_SUCCESSFUL_BUILD/updatesite"
export UPDATE_SITE_SOURCE="$WORKSPACE/de.cau.cs.se.instrumentation.updatesite/target/"

# rm -rf $IRL_COMPILER $UPDATE_SITE
echo $LAST_SUCCESSFUL_BUILD/*
echo $JENKINS_HOME
echo $WORKSPACE
ls -R $JENKINS_HOME/jobs/Kieker-Instrumentation-Record-Language

# mkdir $IRL_COMPILER
# mkdir $UPDATE_SITE

# irl compiler
# tar -cvzpf $IRL_COMPILER/irl-compiler.tar.gz $WORKSPACE/run-irl-compiler.sh $WORKSPACE/lib $WORKSPACE/target/de.cau.cs.se.instrumentation.rl.cli-*.jar

# update site
# cp -r $UPDATE_SITE_SOURCE/* $UPDATE_SITE

# end
