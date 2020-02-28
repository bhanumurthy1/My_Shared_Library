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
        echo "First Stage of Branch2"
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
        echo "Second Stage of Branch2"
        script {
          sh '''       
        printenv          
          '''
        }
      }      
    }
  }
}
