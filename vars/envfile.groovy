def call(String bCommand)
{
  environment{
    buildCommand=bCommand
  }
sh '''
  echo $buildCommand
'''
}
