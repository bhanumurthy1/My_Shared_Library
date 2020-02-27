pipeline
{
agent any
  stages
  {
    stage("First Stage")
    {
      steps
      {
        echo "First Stage of Branch3"
      }
    }
    stage("Second Stage")
    {
      steps
      {
         echo "Second Stage of Branch4"
        script {
          sh '''       
        printenv          
          '''
        }
      }     
    }
  }
}
