def branch="foo"
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
        echo "${JOB_BASE_NAME}"
        branch=${JOB_BASE_NAME}
        echo branch
        
      }
      
    }
    stage("Second Stage")
    {
      steps
      {
        echo "Second Stage of Branch2"
        script {
          sh '''       
        echo ${JOB_BASE_NAME}
          '''
        }
      }      
    }
  }
}
