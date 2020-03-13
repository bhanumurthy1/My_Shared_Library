def call(String bCommand)
{  
    env.temp=bCommand 
    withEnv(["buildCommand=${env.temp}"]) {
    echo "buildCommand =${env.buildCommand}"      
      sh """
      java $buildCommand
      """
    }   
}

