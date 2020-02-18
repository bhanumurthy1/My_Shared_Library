def call(String one,String two)
{         
    checkout([
    $class: 'GitSCM', 
    branches: [[name: ${one} ]],     
    userRemoteConfigs: [[url: ${two}]]
    ])
}
