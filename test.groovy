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
       build JobName
    emailtest("failure","ppravallika@informatica.com",true,"")
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
def emailtest(buildStatus,emailIDs,boolean atchlog,atchfile)
{
  // Default values 
  def subject = "${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'"
  def summary = "${subject} (${env.BUILD_URL})"
  def details = """<p>${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
    <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>"""
   
  print emailIDs
 emailext attachLog: atchlog,
  attachmentsPattern: atchfile,
  body: details,
  recipientProviders: [culprits()],
  subject: subject,
  to: emailIDs 

}
return this;
