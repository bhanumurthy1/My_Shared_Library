def call(String bCommand)
{  
    env.tempvar=bCommand 
    withEnv(["buildCommand=${env.tempvar}"]) {
    echo "buildCommand =${env.buildCommand}"      
      sh """
      java $buildCommand
      """
    }   
}

