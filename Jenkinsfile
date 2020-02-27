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
        println "BRANCH_NAME = " + System.getenv('BRANCH_NAME'); 
        echo "Second Stage of master"
      }      
    }
  }
}
