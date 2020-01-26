
node {
    stage('SCM Checkout') {
          git 'https://github.com/thibaut54/TheLibrary-Microservice-Catalog.git'
    }
    stage('Maven package'){
        def mvnHome = tool name: 'Maven-3.6.3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
    stage('Maven package'){
        def docker = tool name: 'Docker-latest', type: 'org.jenkinsci.plugins.docker.commons.tools.DockerTool'
        sh "${docker}/bin/mvn package"
    }
    agent {
        // Equivalent to "docker build -f Dockerfile.build --build-arg version=1.0.2 ./build/
        dockerfile {
            filename 'Dockerfile'
            label 'my-defined-label'
            args '-v /tmp:/tmp'
        }
    }
}
