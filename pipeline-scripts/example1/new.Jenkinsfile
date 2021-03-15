##see this doc: https://www.jenkins.io/doc/book/pipeline/shared-libraries/#defining-custom-steps


@Library('My-Shared-Lib')
node {
    stage("Hello World") {
        example1 "Bob" // this is the syntax to call a shared library .call(), by passing a parameter 
    }
}
