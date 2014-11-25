#!/bin/bash

# This script creates the following files:
# pom.xml files replacing #VERSION# and #UPDATESITE#
# fix the feature.xml files in the SDK projects
# fix the MANIFEST.MF files
# fix the category.xml file
# fix in cli pom the reference to the rl package version
# please make sure that all these requirements are fulfilled before automating things again

BINDIR=$(cd "$(dirname "$0")"; pwd)/

if [ "$1" == "" ] ; then
	echo "Usage: $0 <version-maven> <version-eclipse> <repo-rel-path>"
	echo ""
	echo "For a version 1.1.0 (snapshot or release) the corresponding parameters are"
	echo "version-maven is 1.1.0-SNAPSHOT or 1.1.0"
	echo "version-eclipse is 1.1.0.qualifier or 1.1.0"	
	echo "repo-rel-path is snapshot or release/1.1"
	exit 1
else
	VERSION_MAVEN="$1"
fi

if [ "$2" == "" ] ; then
	echo "Usage: $0 <version-maven> <version-eclipse> <repo-rel-path>"
	exit 1
else
	VERSION_ECLIPSE="$2"
fi

if [ "$3" == "" ] ; then
	echo "Usage: $0 <version-maven> <version-eclipse> <repo-rel-path>"
	exit 1
else
	REL_PATH=`echo "$3" | sed 's/\//\\\\\//g'`
fi

TMP=`tempfile`

# create pom.xml files
for I in `find ${BINDIR}/../.. -name 'pom.xml.template'` ; do
	J=`echo "$I" | sed 's/\.template$//g'`
	echo $J
	cat "$I" | sed "s/#VERSION#/${VERSION_MAVEN}/g" | sed "s/#UPDATESITE#/${REL_PATH}/g" > "$J"
done

# create feature files
for I in `find ${BINDIR}/../.. -name 'feature.xml.template'` ; do
	J=`echo "$I" | sed 's/\.template$//g'`
	echo $J
	cat "$I" | sed "s/#VERSION#/${VERSION_ECLIPSE}/g" | sed "s/#UPDATESITE#/${REL_PATH}/g" > "$J"
done

# create category files
for I in `find ${BINDIR}/../.. -name 'category.xml.template'` ; do
	J=`echo "$I" | sed 's/\.template$//g'`
	echo $J
	cat "$I" | sed "s/#VERSION#/${VERSION_ECLIPSE}/g" | sed "s/#UPDATESITE#/${REL_PATH}/g" > "$J"
done

# fix manifest files
for I in `find ${BINDIR}/../.. -name 'MANIFEST.MF'` ; do
	echo $I
	cat "$I" |  sed "s/\(Bundle-Version: \).*/\1${VERSION_ECLIPSE}/g" > "$TMP"
	cp "$TMP" "$I"
done

# fix category xml

# end

