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
          echo env.BRANCH_NAME
           printenv          
          '''
        }
      }      
    }
  }
}
