pipeline {
	agent any
	
	stages {
	
		stage('Compile stage') {
			steps {
				withMaven(maven: 'Local-Maven') {
					bat 'mvn clean compile'
				}
			}
		}
		
		stage('Testing stage') {
			steps {
				withMaven(maven: 'Local-Maven') {
					bat 'mvn test'
				}
			}
		}
		
		stage('Deployment stage') {
			steps {
				withMaven(maven: 'Local-Maven') {
					bat 'mvn deploy'
				}
			}
		}
		
		
	
	}
}