def call(String bCommand)
{
  script
  {
    echo bCommand
    env.buildCommand=bCommand
  }
 // env.buildCommand=bCommand
  sh '''
  echo $buildCommand
  echo \$bCommand
'''
}
