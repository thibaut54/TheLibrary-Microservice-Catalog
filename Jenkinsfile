
node {

    stage('Initialize'){
        def dockerHome = tool 'docker'
        env.PATH = "${dockerHome}/bin:${env.PATH}"
    }

    stage('SCM Checkout') {
          git 'https://github.com/thibaut54/TheLibrary-Microservice-Catalog.git'
    }
    stage('Maven package'){
        def mvnHome = tool name: 'Maven-3.6.3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
    def img = stage('Build docker image'){
        docker.build("thelibrary-img", '.')
    }
    stage('Run docker image'){
        img.withRun("--name run-$BUILD_ID -p 8090:8090") {
            sh 'docker ps'
        }
    }
}
