#!/bin/bash
#
# Create archive for IRL compiler

# irl compiler
tar -cvzpf $WORKSPACE/irl-compiler.tar.gz $WORKSPACE/run-irl-compiler.sh $WORKSPACE/lib $WORKSPACE/target/de.cau.cs.se.instrumentation.rl.cli-*.jar

# end
