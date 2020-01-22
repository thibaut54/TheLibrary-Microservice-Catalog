node{
    def app
    stage('Clone'){
        checkout scm
    }
    stage('Build image'){
        app = docker.build('thelibrary-back')
    }
    stage('Run image'){
        docker.image('thelibrary-back').withRun('-p 80:90'){ c->
            sh 'docker ps'
            sh 'curl localhost'
        }
    }
}
