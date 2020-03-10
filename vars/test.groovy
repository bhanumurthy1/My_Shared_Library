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

def stageBuild()
{
    build 'HelloWorld'
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
