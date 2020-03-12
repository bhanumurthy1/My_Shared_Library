def call(String vars)
{ 
  String somevar=vars
  sh '''
    email(Stung)
    {
      echo "hey function"
      echo ${Stung}
    }
    email("bjfv")
  '''
  
}
