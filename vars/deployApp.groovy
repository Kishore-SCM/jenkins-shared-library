// vars/deployApp.groovy
 
def call(Map config = [:]) {
    def appName     = config.appName     ?: 'unknown-app'
    def environment = config.environment ?: 'staging'
 
    echo '========================================'
    echo " Deploying: ${appName}"
    echo " Environment: ${environment}"
    echo '========================================'
 
    sh """
        echo 'Pulling Docker image for ${appName}...'
        echo 'Stopping old container...'
        echo 'Starting new container in ${environment}...'
        echo 'Health check passed!'
        echo 'Deployment of ${appName} to ${environment} SUCCESSFUL!'
    """
    echo "Deploy stage DONE for ${appName}"
}
