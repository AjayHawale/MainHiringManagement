pipeline {
    agent any

    stages {
        stage('Build') 
        {
            steps 
            {
                echo 'Hello World'
            }
        }
         stage('Test') 
        {
            steps 
            {
                echo 'Hello World'
            }
        }
         stage('Deploy') 
        {
            steps 
            {
                echo 'Hello World'
            }
        }
         
    }
post{
always{
emailext body: 'Summary of all stages ', subject: 'Jenkins Pipeline Report', to: 'ajay.digambar@brigosha.com'
}
}
}
