def call(String vars)
{ 
  String somevar=vars
  sh '''
    email()
    {
      echo "hey function"
      echo $1
    }
    email("build compile")
  '''
  
}
