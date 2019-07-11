node {

	stage('checkout') {
		checkout scm
	}
	
	stage('compile') {
		./gradlew clean
		./gradlew bootJar
	}
	
}