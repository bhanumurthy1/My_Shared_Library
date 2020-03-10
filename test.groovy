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
    build JobName
    GroovyShell shell = new GroovyShell()
    def tools = shell.parse(new File('email.groovy'))
    tools.call("Failure","ppravallika@informatica.com",true,"")
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
