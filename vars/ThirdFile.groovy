def call(Map params)
{         
    checkout([
    $class: 'GitSCM', 
    branches: [[name: params.getValue("branch") ]],     
    userRemoteConfigs: [[url: params.getValue("url")]]
    ])
}
