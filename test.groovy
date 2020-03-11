//def modules = [:]
import email
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
    new email().emailtest("failure","ppravallika@informatica.com",true,"")
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
