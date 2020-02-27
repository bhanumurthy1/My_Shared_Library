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
        script 
        {
          Branch_Name=env.BRANCH_NAME
          echo ${Branch_Name} 
        }
      }      
    }
    stage("Second Stage")
    {
      steps
      {
        script {
          sh '''                   
         printenv BRANCH_NAME
            printenv          
          '''
        }
      }      
    }
  }
}
