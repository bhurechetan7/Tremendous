pipeline {
      agent any
      stages{
       stage ('Build'){
           steps{
           withMaven(maven : 'Maven'){
               sh 'clean package sonar:sonar'
           }
          }
      }
      stage ('Testing stage'){
        steps{
           withMaven(maven : 'Maven'){
               sh 'mvn test'
           }
          }
      }
      
}
}
