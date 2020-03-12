def call(String vars)
{
  sh '''
    java $vars
  '''
}
