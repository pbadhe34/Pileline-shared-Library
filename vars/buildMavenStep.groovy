//vars/buildMavenStep
def call(Map config) {
    node {
        git url: "https://github.com/${config.user}/${config.repo}.git"
        sh 'mvn install'
        //mail to: '...', subject: "${config.name} app is build", body: '...'
        echo "The maven app ${config.repo} is built"
    }
}
