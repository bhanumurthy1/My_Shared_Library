//def modules = [:]
import email.groovy
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
    GroovyShell shell = new GroovyShell()
def emobj = shell.parse(new File('email.groovy'))
    emobj.emailtest("failure","ppravallika@informatica.com",true,"")
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
