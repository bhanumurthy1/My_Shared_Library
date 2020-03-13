def call(String bCommand)
{
  env.buildCommand=bCommand
  sh '''
  echo $buildCommand
'''
}
