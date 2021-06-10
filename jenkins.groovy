pipeline {
    agent any
    stages {
        stage ('Git Checkout') {
            steps{
                sh "touch readme.md"
                sh "git init"
                sh "git add readme.md"
                sh "git commit -m "first commit""
                sh "remote add origin https://github.com/rajeevgit05"
                sh "git push -u origin master"
            }
        }
        stage ('Build') {
            steps{
                echo "Build"
            }
        }
 