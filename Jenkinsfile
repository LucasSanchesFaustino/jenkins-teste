pipeline {
    agent any

    stages {
        stage ('Build backend') {
            steps {
                bat 'mvn clean package -DskipTests=true'
            }
        }
        stage ('Unit Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage ('Sonar Analysis') {
            environment {
                scannerHome = tool 'SONAR_SCANNER'
            }
            steps {
                withSonarQubeEnv('SONAR_LOCAL') {
                    bat "${scannerHome}/bin/sonar-scanner -e -Dsonar.projectKey=DeployBack -Dsonar.projectName='DeployBack' -Dsonar.host.url=http://localhost:9000 -Dsonar.token=squ_fed96be76004d99ce40d75e29d6ecce302c4b330 -Dsonar.java.binaries=target -Dsonar.qualitygate.wait=true -Dsonar.qualitygate.timeout=300"
                }
            }
        }

        stage ('Deploy backend') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'TomcatLogin', path: '', url: 'http://localhost:8080/')], contextPath: 'calculator', war: 'target/calculator.war'
            }
        }

        stage ('Api Tests') {
            steps {
                git 'https://github.com/LucasSanchesFaustino/api-tests'
                bat 'mvn test'
            }
        }
    }
}