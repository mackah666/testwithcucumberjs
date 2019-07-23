pipeline {
        
	agent any
	tools {nodejs "node"}	
        stages {
		stage('Run Cucumber') {
			steps{
    				// some block
				sh 'npm install'
				sh 'npm test'			
			}	
		}
	}
}
