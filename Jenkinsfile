def Branch_Name
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
          Branch_Name=env.BRANCH_NAME
          echo ${Branch_Name}          
         printenv BRANCH_NAME
            printenv          
          '''
        }
      }      
    }
  }
}
