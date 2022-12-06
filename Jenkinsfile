node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def scannerHome = tool 'SonarQube';

    withSonarQubeEnv("SonarQube") {
      sh "${scannerHome}/bin/sonar-scanner \
      -D sonar.login=admin \
      -D sonar.password=Suneetha@16 \
      -D sonar.projectKey=Rate \
      -D sonar.exclusions=vendor/**, resources/**,**/*.java \
      -D sonar.host.url=http://localhost:9000/"
    }
  }
}