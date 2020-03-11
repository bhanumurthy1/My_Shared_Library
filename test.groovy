//def modules = [:]
def stagecleanUp()
{  
    cleanWs()     
}
def stageTest()
{   
        sh '''
                 echo "Testing stage"                   
                    pwd 
                    '''     
}

def stageBuild(String JobName)
{
    //modules.first = load 'email.groovy'
   // modules.first.emailtest("failure","ppravallika@informatica.com",true,"")
    build JobName    
}
def stageArchive()
{
    sh '''
    echo "Archiving the artifacts"
    '''
}
def stagePost()
{
    sh '''
    echo "failure"
    '''
    
}
return this;
