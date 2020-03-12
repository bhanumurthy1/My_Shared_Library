def call(String vars)
{ 
  String somevar=vars
  sh '''
    email()
    {
      echo "hey function"
    }
    email()
  '''
  
}
