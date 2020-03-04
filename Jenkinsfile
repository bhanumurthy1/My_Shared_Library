def BASE_NAME
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
        echo "The Job Base Name is ${env.JOB_BASE_NAME}"
        BASE_NAME=System.getenv("JOB_BASE_NAME");
        echo "${BASE_NAME}"
        
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
