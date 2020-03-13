def call(String bCommand)
{
  script
  {
    echo bCommand
    export env.buildCommand=bCommand
  }
  env.buildCommand=bCommand
  sh '''
  echo $buildCommand
  echo \$bCommand
'''
}
