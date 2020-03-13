def call(String bCommand)
{
  env.buildCommand=bCommand
  echo bCommand
  sh '''
  echo $buildCommand
  echo \$bCommand
'''
}
