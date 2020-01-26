
node {
    stage('SCM Checkout') {
          git 'https://github.com/thibaut54/TheLibrary-Microservice-Catalog.git'
    }
    stage('Maven package'){
        def mvnHome = tool name: 'Maven-3.6.3', type: 'maven'
            sh '${mvnHome}/bin/mvn clean package'
    }
}
