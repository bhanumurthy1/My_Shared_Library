def call(String bCommand)
{
  def temp=bCommand
  environment {
    buildCommand=$temp
  }
sh '''
  echo $buildCommand
'''
}
