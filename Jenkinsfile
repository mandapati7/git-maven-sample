pipeline {
	agent any
	
	stages {
	
		stage('Compile stage') {
			steps {
				withMaven(maven: 'Local-Maven') {
					sh 'mvn clean compile'
				}
			}
		}
		
		stage('Testing stage') {
			steps {
				withMaven(maven: 'Local-Maven') {
					sh 'mvn test'
				}
			}
		}
		
		stage('Deployment stage') {
			steps {
				withMaven(maven: 'Local-Maven') {
					sh 'mvn deploy'
				}
			}
		}
		
		
	
	}
}