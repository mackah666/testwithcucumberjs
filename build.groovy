pipeline {
        
	agent {
        docker {
            image 'node:6-alpine'
            args '-p 3000:3000'
        }
    }
    environment {
        CI = 'true' 
    }	
        stages {
		stage('Run Cucumber') {
			steps{
    				// some block
				sh 'npm install'\
				//sh "
			}	
		}
	}
}
