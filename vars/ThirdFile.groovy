def call(Map params)
{         
    checkout([
    $class: 'GitSCM', 
    branches: [[name: params.branch ]],     
    userRemoteConfigs: [[url: params.url]]
    ])
    echo params.dummy
    addShortText background: params.bgcolor,
        borderColor: params.bcolor,
        color: params.ccolor, 
        link: params.clink,
        text: params.ctext
}
