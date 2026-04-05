// vars/testApp.groovy
 
def call(Map config = [:]) {
    def appName  = config.appName  ?: 'unknown-app'
    def testType = config.testType ?: 'unit'
 
    echo '========================================'
    echo " Testing: ${appName}"
    echo " Test type: ${testType}"
    echo '========================================'
 
    sh """
        echo 'Setting up test environment...'
        echo 'Running ${testType} tests for ${appName}...'
        echo 'Test Results: 47 passed, 0 failed'
        echo 'Coverage: 84%'
    """
    echo "Test stage DONE for ${appName}"
}
