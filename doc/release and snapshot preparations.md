# How to Prepare the Kieker Development Tools for Release or Development

For every release and every new snapshot setup requires preparation
before development and maintenance can be performed. This document
describes the process and the human actions to be performed.

## Prerequisites 

- the project root directory of the git repository is named ```irl```
- $RELEASE refers to the next release version, e.g., 1.3.0
- $SNAPSHOT refers to the next development version, e.g., 1.3.0-SNAPSHOT
- $VERSION refers to the version to be set. This is either $RELEASE or
  $SNAPSHOT, depending on your goal.
- $BRANCH refers to the local branch to commit

## Process 

'Note:' This process could be improved with the maven-release-plugin

### Release

- Make sure you are in the development branch (master)
  # git checkout master
- Make sure all features have been merged into this branch
- Make sure all changes have been committed
- Create a new release branch
  # git checkout -b rel-$RELEASE
- The $BRANCH name for release branches is the version number prefixed
  by ```rel-```, e.g., rel-1.3.0
- Continue with 'Common Tasks'

### Snapshot

- Make sure you are in the development branch (master)
- Decide on a $SNAPSHOT version, e.g., 1.3.0-SNAPSHOT for the
  development towards a 1.3.0 release version.
- Continue with 'Common Tasks'

### Common Tasks

- Clean the repository
  # mvn clean
- Set version
  # mvn versions:set -DnewVersion=$VERSION
  This should produce output which concludes as follows. It is not an
  error that all but the root package are skipped, as they do not
  include their own version setting.
```
[INFO] Reactor Summary:
[INFO] 
[INFO] Kieker Development Tools ........................... SUCCESS [  3.247 s]
[INFO] Kieker Record Language Core Services ............... SKIPPED
[INFO] Kieker Aspect Language Core Services ............... SKIPPED
[INFO] Kieker Aspect Language IDE Plugin .................. SKIPPED
[INFO] Kieker Record Language IDE Plugin .................. SKIPPED
[INFO] Kieker Record Language User Interface .............. SKIPPED
[INFO] Kieker Aspect Language User Interface .............. SKIPPED
[INFO] Kieker Aspect Language Tests ....................... SKIPPED
[INFO] Instrumentation Aspect Language PCM Model Handler .. SKIPPED
[INFO] Kieker Aspect Language Feature ..................... SKIPPED
[INFO] Kieker Record Language Tests ....................... SKIPPED
[INFO] Kieker Record Language Feature ..................... SKIPPED
[INFO] Kieker Development Tools - Update Site ............. SKIPPED
[INFO] Kieker Development Tools - Target Platform ......... SKIPPED
[INFO] Kieker Record Language CLI Compiler ................ SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
- Fix the version settings in the ```feature.xml```, ```category.xml```
  and ```MANIFEST.MF``` files of Eclipse. Replace the $KIND with either
  snapshot or release depending on your process.
  # scripts/set-version-properties.sh $KIND $VERSION
- Check for git related issues
  # git status
- Make sure all relevant information is remembered by git and that the
  .gitignore is setup properly.
- Commit the changes when done. Provide a comment referring to the
  version and development process step just performed.
  # git commit -a
- Build the new version setup for the first time.
  # mvn compile
- Fix any remaining issues
- Commit and comment your fixes
- Push your changes
  # git push origin/$BRANCH $BRANCH

