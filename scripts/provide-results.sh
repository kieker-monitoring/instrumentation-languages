#!/bin/bash
#
# Create archive for IRL compiler
export COMPILER_DIR="$WORKSPACE/kieker.develop.rl.cli"

# irl compiler
cd $COMPILER_DIR
tar -cvzpf $WORKSPACE/irl-compiler.tar.gz run-irl-compiler.sh target/kieker.develop.rl.cli-*.jar

# end
