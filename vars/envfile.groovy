def call(String bCommand)
{  
    env.temp=bCommand 
  withEnv(["buildCommand=${env.temp}"]) {
    echo "buildCommand =${env.buildCommand}"
    echo buildCommand  
     sh 'echo env.buildCommand'
    }   
}

