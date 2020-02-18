def call(Map params)
{    
    echo "Hello Job u r going to run now ,${Name}"   
    build 'Name'
    echo "Hello Job ur done"    
    checkout([
    $class: 'GitSCM', 
    branches: [[name: params.branch]],     
    userRemoteConfigs: [[url: params.url]]
    ])
}
