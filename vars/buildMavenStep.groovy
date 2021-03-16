//vars/buildMavenStep
def call(Map config) {
    node {
        git branch: 'main', credentialsId: 'pr-jenkins-user',  url: "https://github.com/${config.user}/${config.repo}.git"
        def mvnHome = tool 'maven3.5'
 
        
        sh  "${mvnHome}/bin/mvn package"     
 
         
        sh  "${mvnHome}/bin/mvn package"       
 
        //mail to: '...', subject: "${config.name} app is build", body: '...'
        echo "The maven app ${config.repo} is built"
    }
}
