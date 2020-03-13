def call(String bCommand)
{
  script
  {
    env.temp=bCommand    

  withEnv(["buildCommand=${env.temp}"]) {
    echo "buildCommand =${env.buildCommand}"
    echo buildCommand
    java -version
                } 
}
}
