def call(String name = "Dada") {
    script {
        sh """
            echo Hi ${name}
        """
    }
}
