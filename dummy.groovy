pipeline
{
  agent any
  stages
  {
    stage("first")
    {
      steps
      {
        echo "first stage"
      }
    }
    stage("second")
    {
      steps
      {
        echo "second stage"
      }
    }
  }
}
