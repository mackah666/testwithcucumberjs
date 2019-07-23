pipeline {
        
	agent any	
        stages {
		stage('Run Cucumber') {
			steps{
    				// some block
				sh 'export PATH=/usr/local/bin'
				sh 'npm install'			
			}	
		}
	}
}
