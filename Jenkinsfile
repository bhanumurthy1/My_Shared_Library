pipeline
{
agent any
  stages
  {
    stage("First Stage")
    {
      steps
      {
        echo "First Stage of master"
      }      
    }
    stage("Second Stage")
    {
      steps
      {
        script {
          sh '''
          echo printenv.BRANCH_NAME
            printenv          
          '''
        }
      }      
    }
  }
}
