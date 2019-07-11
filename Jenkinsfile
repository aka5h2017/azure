node {

	stage('checkout') {
		checkout scm
	}
	
	stage('compile') {
		bat './gradlew clean'
		bat './gradlew bootJar'
		bat 'echo hello'
	}
	
}