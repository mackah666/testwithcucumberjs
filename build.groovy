pipeline {
        
	agent any	
        stages {
		stage('Run Cucumber') {
			steps{
    				// some block
				sh 'ls -al'
				sh '/Users/mackah666/.local/bin/npm -v'
				//sh '/usr/local/bin/node -v'			
			}	
		}
	}
}
