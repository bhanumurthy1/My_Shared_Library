def call(String bCommand)
{
  
    env.temp=bCommand    

  withEnv(["buildCommand=${env.temp}"]) {
    echo "buildCommand =${env.buildCommand}"
                }
 // env.buildCommand=bCommand
  sh '''
  echo $buildCommand
  echo $bCommand
'''
}
