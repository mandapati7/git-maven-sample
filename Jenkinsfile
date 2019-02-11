pipeline {
	agent any
	
	stages {
	
		stage('Compile stage') {
			steps {
				withMaven(maven: 'maven-3.5.3') {
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
	
	}
}