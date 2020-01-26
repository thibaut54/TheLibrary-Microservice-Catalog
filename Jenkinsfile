
node {
    stage('SCM Checkout') {
          git 'https://github.com/thibaut54/TheLibrary-Microservice-Catalog.git'
    }
    stage('Maven package'){
            sh 'mvn package'
    }
}
