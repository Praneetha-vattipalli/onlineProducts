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
node {
  stage('SCM') {
    git 'https://github.com/Praneetha-vattipalli/onlineProducts.git'
  }
  stage('SonarQube analysis') {
    withSonarQubeEnv() { // You can override the credential to be used
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
    }
  }
}
// node {
//   stage('SCM') {
//     git 'https://github.com/Praneetha-vattipalli/onlineProducts.git'
//   }
//   stage('SonarQube analysis') {
//     withSonarQubeEnv(credentialsId: 'f225455e-ea59-40fa-8af7-08176e86507a', installationName: 'SonarQube') { // You can override the credential to be used
//       sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
//     }
//   }
// }