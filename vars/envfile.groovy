def call(String bCommand)
{
  script
  {
    env.temp=bCommand
  }

  withEnv(["buildCommand=${env.bCommand}"]) {
    echo "buildCommand =${env.buildCommand}"
                }
 // env.buildCommand=bCommand
  sh '''
  echo $buildCommand
  echo $bCommand
'''
}
