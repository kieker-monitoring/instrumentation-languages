### building the language server

 1. run `mvn compile package -P ls`
 2. choose the jar for your OS in `buildLS/target/exe/`

### use the build jar

 1. download the `klighd-client` from https://github.com/kieler/klighd-vscode/releases/tag/v0.4.1
 2. run `klighd-linux --ls_path PATH_TO_LS_JAR PATH_TO_YOUR_MODEL.xmi`, make sure that the referenced files are in the same directory
 3. a browser window should get opened with the requested diagram


