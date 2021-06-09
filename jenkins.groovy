pipeline {
    agent any
    stages {
        stage ('Git Checkout') {
            steps{
                echo "git checkout"
                checkout([$class: 'GitSCM',
    branches: [[name: 'Branch name']],
    extensions: [[$class: 'WipeWorkspace']],
    userRemoteConfigs: [[url: 'git url']]
])
            }
        }
        stage ('Build') {
            steps{
                echo "Build"
            }
        }
 