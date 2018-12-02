pipeline {
        
	agent any	
        stages {
		stage('Run Cucumber') {
			steps{
    				// some block
				sh 'ls -al'
				sh 'node -v'
			}	
		}
	}
}
