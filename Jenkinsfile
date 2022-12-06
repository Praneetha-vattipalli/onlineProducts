node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def scannerHome = tool 'SonarQube';

    withSonarQubeEnv() {
      sh "${mvn}/bin/mvn clean verify sonar:sonar -D sonar.projectKey=Rate"
    }
  }
}