pipeline {
        
	agent any	
        stages {
		stage('Run Cucumber') {
			steps{
    				// some block
				sh 'ls -al'
				sh "/usr/local/bin/npm install"
				//sh '/usr/local/bin/node -v'			
			}	
		}
	}
}
