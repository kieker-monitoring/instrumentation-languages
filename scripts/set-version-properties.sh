#!/bin/bash

# This script creates the following files:
# fix the feature.xml files in the SDK projects
# fix the MANIFEST.MF files
# fix the category.xml file
# fix in cli pom the reference to the rl package version
# please make sure that all these requirements are fulfilled before automating things again

BINDIR=$(cd "$(dirname "$0")"; pwd)/

function usage() {
	if [ "$2" != "" ] ; then
		echo $2
	fi
	cat << EOF
Usage: $1 (snapshot|release) <version>

Description:
  snapshot      = snapshot version for a development branch
  release       = release version for a release branch
  <version>     = indicate the x.y.z version number
EOF
	exit 1
}

if [ "$1" == "" ] ; then
	usage $0 ""
elif [ "$1" == "release" ] ; then
	if [[ `git rev-parse --abbrev-ref HEAD` =~ ^rel-[0-9]*\.[0-9]*\.[0-9]$ ]] ; then
		echo "Release branch detected"
		SUFFIX=""
	else
		echo "This is not a release branch"
		exit 1
	fi
elif [ "$1" == "snapshot" ] ; then
	SUFFIX=".qualifier"
else
	uage $0 "Specify either snapshot or release"
fi

if [ "$2" == "" ] ; then
	usage $0 "Specify version number, e.g., 1.2.0"
else
	VERSION="$2$SUFFIX" 
fi

TMP=`tempfile`

# create feature files
for I in `find ${BINDIR}/.. -name 'feature.xml'` ; do
	cat "$I" | sed "s/version=\"[0-9]*\.[0-9]*\.[0-9]*\.qualifier/version=\"${VERSION}/g" > "${TMP}"
	mv "${TMP}" "$I" 
done

# create category files
for I in `find ${BINDIR}/.. -name 'category.xml'` ; do
	cat "$I" | sed "s/version=\"[0-9]*\.[0-9]*\.[0-9]*\.qualifier/version=\"${VERSION}/g" | \
		sed "s/_[0-9]*\.[0-9]*\.[0-9]*\.qualifier\.jar\"/_${VERSION}\.jar\"/g" > "${TMP}"
	mv "${TMP}" "$I" 
done

# fix manifest files
for I in `find ${BINDIR}/.. -name 'MANIFEST.MF'` ; do
	cat "$I" |  sed "s/\(Bundle-Version: \).*/\1${VERSION}/g" > "$TMP"
	mv "$TMP" "$I"
done

# end

