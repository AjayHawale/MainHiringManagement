pipeline
{
    agent any

    stages
    {
        stage('Build')
        {
            steps
            {
                echo ' Build Test '
            }
        }
 stage('Test')
        {
            steps
            {
                echo 'Test Portal'
            }
        }
 stage('Deploy')
        {
            steps
            {
                echo 'Deploy Portal'
            }
        }
    }
    post 
{
failure 
{
emailext body: 'Summary Report', subject: 'Jenkins Run', to: 'ajay.digambar@brigosha.com'
}

}
}
