#!/bin/bash
#
# Create archive for IRL compiler and copy the update site to lastSuccessfulBuild

export LAST_SUCCESSFUL_BUILD="$WORKSPACE/../lastSuccessfulBuild/"
export IRL_COMPILER="$LAST_SUCCESSFUL_BUILD/irl-compiler"
export UPDATE_SITE="$LAST_SUCCESSFUL_BUILD/updatesite"
export UPDATE_SITE_SOURCE="$WORKSPACE/de.cau.cs.se.instrumentation.updatesite/target/"

export PROJECT_NAME="Kieker-Instrumentation-Record-Language"
export PROJECT_RESULTS="$JENKINS_HOME/jobs/$PROJECT_NAME/"

ls -l "$PROJECT_RESULTS/builds/$BUILD_ID"
ls -l "$PROJECT_RESULTS/builds/$BUILD_ID/de.cau.cs.se.instrumentation.updatesite/builds/$BUILD_NUMBER"

echo "EXAMPLE2" > "$PROJECT_RESULTS/builds/$BUILD_ID/de.cau.cs.se.instrumentation.updatesite/builds/$BUILD_NUMBER/example2.txt"

# mkdir $IRL_COMPILER
# mkdir $UPDATE_SITE

# irl compiler
# tar -cvzpf $IRL_COMPILER/irl-compiler.tar.gz $WORKSPACE/run-irl-compiler.sh $WORKSPACE/lib $WORKSPACE/target/de.cau.cs.se.instrumentation.rl.cli-*.jar

# update site
# cp -r $UPDATE_SITE_SOURCE/* $UPDATE_SITE

# end
