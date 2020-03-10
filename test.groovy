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
    Class groovyClass = new GroovyClassLoader(getClass().getClassLoader()).parseClass("email.groovy");
GroovyObject myObject = (GroovyObject) groovyClass.newInstance();
    //GroovyShell shell = new GroovyShell()
    //def tools = shell.parse(new File('email.groovy'))
    myObject.call("Failure","ppravallika@informatica.com",true,"")
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
