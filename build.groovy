pipeline {
        
	agent any
        stages {
		stage('Run Cucumber') {
			steps{
    				// some block
				sh "npm install"
				//sh "
			}	
		}
	}
}
