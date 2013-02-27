#!/bin/sh

PID=`ps auxw | grep CLIServer | grep java | awk '{ print $2 }'`
RECORDS=10000000

START=`date +%s`
perl test.pl
sleep 1
kill -TERM $PID
STOP=`date +%s`

DIST=`expr $STOP - $START`
echo "Delta $DIST"
TPR=`expr $DIST \* 100 / $RECORDS`
RPS=`expr $RECORDS / $DIST`
echo "TPR "$TPR
echo "RPS"$RPS

# end
