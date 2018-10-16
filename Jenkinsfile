pipeline {
  agent {
        docker {
            image 'maven:3-alpine'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
  stages {
    
    stage('Build') {
      steps {
        sh 'mvn -B'
      }
    } 
    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            sh 'echo Test'
          }
        }
        stage('Junit') {
          steps {
            sh 'echo Junit'
          }
        }
      }
    }
    stage('Static Analysis') {
      steps {
        sh 'echo Static Analysis'
      }
    }
    stage('Deployment') {
      steps {
        sh 'echo Deployment'
      }
    }
  }
}