//vars/buildMavenStep
def call(Map config) {
    node {
        git branch: 'main', credentialsId: 'pr-jenkins-user',  url: "https://github.com/${config.user}/${config.repo}.git"
        
        sh "export PATH='/home/dell/Desktop/Jenkins-CI-Introduction/Day4/apache-maven-3.5.0/bin:$PATH'"
   
         sh 'mvn package'

        //mail to: '...', subject: "${config.name} app is build", body: '...'
        echo "The maven app ${config.repo} is built"
    }
}
