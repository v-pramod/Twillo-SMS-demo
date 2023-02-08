pipeline{
    agent any
    tools{
        maven 'maven_3_9_0'
    }
    stages{
        stage('mavnen build'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/v-pramod/Twillo-SMS-demo']])
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('lint'){
            steps{
                sh 'mvn pmd:check -X'
            }
        }
        stage('test'){
            steps{
                sh 'mvn clean test --also-make'
            }
        }
    }
}