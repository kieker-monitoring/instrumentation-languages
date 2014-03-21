#!/bin/bash
#
# Create archive for IRL compiler
export COMPILER_DIR="$WORKSPACE/de.cau.cs.se.instrumentationrl.cli"

# irl compiler
tar -cvzpf $WORKSPACE/irl-compiler.tar.gz $COMPILER_DIR/run-irl-compiler.sh $COMPILER_DIR/lib $COMPILER_DIR/target/de.cau.cs.se.instrumentation.rl.cli-*.jar

# end
