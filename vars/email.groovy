def call(buildStatus,emailIDs,boolean atchlog,atchfile)
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
