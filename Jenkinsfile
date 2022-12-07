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
                     sh 'mvn sonar:sonar'
                                              }
                       }
                                       }
          }