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
ls -l "$JENKINS_HOME/jobs/modules/de.cau.cs.se.instrumentation\$de.cau.cs.se.instrumentation.updatesite/builds/"
ls -l "$JENKINS_HOME/jobs/modules/de.cau.cs.se.instrumentation\$de.cau.cs.se.instrumentation.updatesite/builds/$BUILD_ID"

ls -l "$JENKINS_HOME/jobs/modules/de.cau.cs.se.instrumentation\$de.cau.cs.se.instrumentation.cli/builds/"
ls -l "$JENKINS_HOME/jobs/modules/de.cau.cs.se.instrumentation\$de.cau.cs.se.instrumentation.cli/builds/$BUILD_ID"

echo "EXAMPLE" > "$JENKINS_HOME/jobs/Kieker-Instrumentation-Record-Language/builds/$BUILD_ID/example.txt"
echo "EXAMPLE2" > "$JENKINS_HOME/jobs/modules/de.cau.cs.se.instrumentation\$de.cau.cs.se.instrumentation.cli/builds/$BUILD_ID/example2.txt"

# mkdir $IRL_COMPILER
# mkdir $UPDATE_SITE

# irl compiler
# tar -cvzpf $IRL_COMPILER/irl-compiler.tar.gz $WORKSPACE/run-irl-compiler.sh $WORKSPACE/lib $WORKSPACE/target/de.cau.cs.se.instrumentation.rl.cli-*.jar

# update site
# cp -r $UPDATE_SITE_SOURCE/* $UPDATE_SITE

# end
