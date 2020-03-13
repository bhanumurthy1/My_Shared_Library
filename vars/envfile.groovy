def call(String bCommand)
{
  environment
  {
    buildCommand=bCommand
  }  
 // env.buildCommand=bCommand
  sh '''
  echo $buildCommand
  echo $bCommand
'''
}
