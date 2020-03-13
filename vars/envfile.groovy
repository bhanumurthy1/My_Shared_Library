def call(String bCommand)
{
  script
  {
    env.buildCommand=bCommand
  }  
 // env.buildCommand=bCommand
  sh '''
  echo $buildCommand
  echo $bCommand
'''
}
