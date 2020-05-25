pipeline {
    agent any
    environment {
        DRIVERS_LOC = "/var/lib/jenkins/selenium-drivers/"
    }
    tools {
        // Usa aquí el nombre de tu instalación de Maven en Jenkins Tools
        maven "Default maven"
    }
    stages {
        stage('Git clone') {
            steps{
                // Update the URL to your repo
                git 'https://github.com/tu-usuario/tu-repo-selenium.git'
            }
        }
        stage('Firefox tests') {
            steps {
                // Run Maven on xvfb environment display.
                // Update the path/to/your/pom.xml as necessary
                sh "xvfb-run mvn -f path/to/pom.xml clean test -Dwebdriver.gecko.driver=${DRIVERS_LOC}/geckodriver"
            }
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
