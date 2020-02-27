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
        node {
        echo 'Pulling...' + env.BRANCH_NAME
        }
      }      
    }
  }
}
