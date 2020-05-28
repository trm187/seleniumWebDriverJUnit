pipeline {
    agent any
    environment {
        DRIVERS_LOC = "/var/lib/jenkins/selenium-drivers/"
    }
    tools {
        // Usa aquí el nombre de tu instalación de Maven en Jenkins Tools
        maven "Default Maven"
    }
    stages {
        stage('Git clone') {
            steps{
                // Update the URL to your repo
                git 'https://github.com/trm187/seleniumWebDriverJUnit'
            }
        }

        stage('Chrome tests'){
                steps{
                    sh"xvfb-run mvn -f seleniumWebDriver/pom.xml clean test -Dwebdriver.chrome.driver=${DRIVERS_LOC}/chromedriver"
                }
                post{
                    success{
                        junit '**/target/surefire-reports/TEST-*.xml'
                    }
                }
            }
    }
}
