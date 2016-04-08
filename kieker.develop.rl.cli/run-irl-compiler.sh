#!/bin/bash

BINDIR=$(cd "$(dirname "$0")"; pwd)

CLASSPATH=$CLASSPATH:"${BINDIR}/target/kieker.develop.rl.cli-1.2.0-SNAPSHOT.jar"

java -cp ${CLASSPATH} kieker.develop.rl.cli.CLICompilerMain "$@"

# end
