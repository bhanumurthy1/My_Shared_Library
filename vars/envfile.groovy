def call(String bCommand)
{
  env.buildCommand=bCommand
  sh "echo \$bCommand"
  sh '''
  echo $buildCommand
  echo \$bCommand
'''
}
