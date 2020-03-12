def call(String vars)
{
  somevar=vars
  sh '''
    java ${somevar}
  '''
}
