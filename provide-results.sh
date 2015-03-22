#!/bin/bash
#
# Create archive for IRL compiler
export COMPILER_DIR="$WORKSPACE/de.cau.cs.se.instrumentation.rl.cli"

# irl compiler
cd $COMPILER_DIR
tar -cvzpf $WORKSPACE/irl-compiler.tar.gz run-irl-compiler.sh target/de.cau.cs.se.instrumentation.rl.cli-*.jar

# end
