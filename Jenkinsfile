pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo Build'
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