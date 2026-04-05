// vars/buildApp.groovy
// This function is called by any Jenkinsfile that imports our shared library.
// The 'call' method runs automatically when you use buildApp() in a pipeline.
 
def call(Map config = [:]) {
    def appName   = config.appName   ?: 'unknown-app'
    def buildTool = config.buildTool ?: 'maven'
 
    echo '========================================'
    echo " Building: ${appName}"
    echo " Tool: ${buildTool}"
    echo '========================================'
 
    // In a real project this runs: mvn clean package OR gradle build
    // For this lab we simulate with echo statements
    sh """
        echo 'Compiling source code for ${appName}...'
        echo 'Running unit compilation checks...'
        echo 'Build completed successfully!'
        echo 'Artifact created: ${appName}-1.0.0.jar'
    """
    echo "Build stage DONE for ${appName}"
}
