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
          echo System.getenv('BRANCH_NAME')
          echo "The Branch Name is "
          echo $Branch_Name
        printenv          
          '''
        }
      }      
    }
  }
}
