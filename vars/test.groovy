def call(String vars)
{ 
  String somevar=vars
  sh '''
    echo \${vars}
    echo \${somevar}    
  '''
}
