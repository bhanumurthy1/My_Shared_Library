def call(String bCommand)
{  
    env.temp=bCommand 
  withEnv(["buildCommand=bCommand"]) {
    echo "buildCommand =${env.buildCommand}"      
      sh """
      java $buildCommand
      """
    }   
}

