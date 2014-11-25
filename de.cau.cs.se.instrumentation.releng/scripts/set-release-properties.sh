#!/bin/bash

# This script must check the following files:
# all pom.xml files but only change the package version tags value and not of any other element of the file
# fix the feature.xml files in the SDK projects
# fix the MANIFEST.MF files
# fix the category.xml file
# fix in cli pom the reference to the rl package version
# please make sure that all these requirements are fulfilled before automating things again

BINDIR=$(cd "$(dirname "$0")"; pwd)/

if [ "$1" == "" ] ; then
	echo "Usage: $0 <version> <repo-rel-path>"
	exit 1
else
	VERSION="$1"
fi

if [ "$2" == "" ] ; then
	echo "Usage: $0 <version> <repo-rel-path>"
	exit 1
else
	REL_PATH=`echo "$2" | sed 's/\//\\\\\//g'`
fi

TMP=`tempfile`

# create pom.xml files
for I in `find ${BINDIR}/../.. -name 'pom.xml.template'` ; do
	J=`echo "$I" | sed 's/\.template$//g'`
	echo $J
	cat "$I" | sed "s/#VERSION#/${VERSION}/g" | sed "s/#UPDATESITE#/${REL_PATH}/g" > "$J"
done

# create feature files
for I in `find ${BINDIR}/../.. -name 'feature.xml.template'` ; do
	J=`echo "$I" | sed 's/\.template$//g'`
	echo $J
	cat "$I" | sed "s/#VERSION#/${VERSION}/g" | sed "s/#UPDATESITE#/${REL_PATH}/g" > "$J"
done

# create feature files
for I in `find ${BINDIR}/../.. -name 'feature.xml.template'` ; do
	J=`echo "$I" | sed 's/\.template$//g'`
	echo $J
	cat "$I" | sed "s/#VERSION#/${VERSION}/g" | sed "s/#UPDATESITE#/${REL_PATH}/g" > "$J"
done

# create category files
for I in `find ${BINDIR}/../.. -name 'category.xml.template'` ; do
	J=`echo "$I" | sed 's/\.template$//g'`
	echo $J
	cat "$I" | sed "s/#VERSION#/${VERSION}/g" | sed "s/#UPDATESITE#/${REL_PATH}/g" > "$J"
done

# fix manifest files
for I in `find ${BINDIR}/../.. -name 'MANIFEST.MF'` ; do
	echo $I
	cat "$I" |  sed "s/\(Bundle-Version: \).*/\1${VERSION}/g" > "$TMP"
	cp "$TMP" "$I"
done

# fix category xml

# end

