// node {
//   stage('SCM') {
//     checkout scm
//   }
//   stage('SonarQube Analysis') {
//     def mvn = tool 'Default Maven';
//     withSonarQubeEnv() {
//       sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=Rate"
//     }
//   }
// }
pipeline{
    agent any
    environment {
        PATH ="$PATH:/prane/apache-maven-3.8.5/bin"
        }
        stages{
          stage('GetCode'){
               steps{
               git 'https://github.com/Praneetha-vattipalli/onlineProducts.git'
               }
               }
           stage('build'){
               steps{
                     sh 'mvn clean package'
                     }
                     }
           stage('SonarQube Analysis'){
                 steps{
                 withSonarQubeEnv('SonarQube'){
                     sh "mvn sonar:sonar"
                 }
}