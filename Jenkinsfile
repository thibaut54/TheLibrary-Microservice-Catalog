node{
    def app

        stage('Clone'){
            checkout scm
        }
        stage('Build image'){
            app = docker.build("thelibrary-back")
        }
}
