#!/bin/bash

echo "this script is broken and should not be used."
exit 1

# This script must check the following files:
# all pom.xml files but only change the package version tags value and not of any other element of the file
# fix the feature.xml files in the SDK projects
# fix the MANIFEST.MF files
# fix the category.xml file
# fix in cli pom the reference to the rl package version
# please make sue that all these requirements are fulfilled before automating things again

BINDIR=$(cd "$(dirname "$0")"; pwd)/
UPDATESITE="${BINDIR}/../../de.cau.cs.se.instrumentation.updatesite"

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
	REL_PATH=`echo "$2" | sed 's/\//\\\//g'`
fi

TMP=`tempfile`

# fix pom.xml files
for I in `find ${BINDIR}/../.. -name 'pom.xml'` ; do
	echo $I
	cat "$I" | sed "s/\(<version>\).*\(<\/version>\)/\1${VERSION}\2/g" > "$TMP"
	cp "$TMP" "$I"
done

# fix manifest files
for I in `find ${BINDIR}/../.. -name 'MANIFEST.MF'` ; do
	echo $I
	cat "$I" |  sed "s/\(Bundle-Version: \).*/\1${VERSION}/g" > "$TMP"
	cp "$TMP" "$I"
done

# fix update site path
cat "${UPDATESITE}/pom.xml" | sed "s/\(<updatesite.path>file:\/\/\/srv\/vhosts\/default\/htdocs\/eus\/\).*\(<\/updatesite.path>\)/\1${REL_PATH}\2/g" > "$TMP"
cp "$TMP" "${UPDATESITE}/pom.xml"

# end

