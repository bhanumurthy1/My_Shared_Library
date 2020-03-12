def call(String vars)
{
  somevar=vars
  sh '''
    echo $vars
    echo $somevar
    //java ${somevar}
  '''
}
