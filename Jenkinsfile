// pipeline{
//     agent any
//     environment {
//         PATH = "$PATH:/prane/apache-maven-3.8.5/bin"
//                 }
//         stages{
//           stage('GetCode'){
//                steps{
//                git 'https://github.com/Praneetha-vattipalli/onlineProducts.git'
//                     }
//                            }
//            stage('build'){
//                steps{
//                      sh 'mvn clean package'
//                      }
//                           }
//            stage('SonarQube Analysis'){
//                  steps{
//                  withSonarQubeEnv('SonarQube'){
//                      sh 'mvn sonar:sonar'
//                                               }
//                        }
//                                        }
//           }
pipeline{
    agent any
    environment {
        PATH = "$PATH:/prane/apache-maven-3.8.5/bin"
    }
    stages{
       stage('GetCode'){
            steps{
                git 'https://github.com/Praneetha-vattipalli/onlineProducts.git'
            }
         }
       stage('Build'){
            steps{
                sh 'mvn clean package'
            }
         }
        stage('SonarQube analysis') {
//    def scannerHome = tool 'SonarScanner 4.0';
        steps{
        withSonarQubeEnv('SonarQube') {
        // If you have configured more than one global server connection, you can specify its name
//      sh "${scannerHome}/bin/sonar-scanner"
        sh "mvn sonar:sonar"
    }
        }
        }

    }
}