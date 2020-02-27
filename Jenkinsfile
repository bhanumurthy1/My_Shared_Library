def Branch_Name = getBinding().getVariables()['BRANCH_NAME'].toString()
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
          echo "The Branch Name is "
          echo $Branch_Name
        printenv          
          '''
        }
      }      
    }
  }
}
