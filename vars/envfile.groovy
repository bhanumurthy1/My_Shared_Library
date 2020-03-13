def call(String bCommand)
{
  
    env.temp=bCommand  
  echo env.temp

  withEnv(["buildCommand=${env.bCommand}"]) {
    echo "buildCommand =${env.buildCommand}"
                }
 // env.buildCommand=bCommand
  sh '''
  echo $buildCommand
  echo $bCommand
'''
}
