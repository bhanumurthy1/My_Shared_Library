def call(String ...toadd)
{
  for(String temp: toadd)
  {
    temp1=temp+" ";
  }
  emailext body: '''Test Mail:<br/>
  Check console output at $BUILD_URL to view the results.<br/>
  <b>Done</b>''', 
  recipientProviders: [culprits()], 
  subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS',
  to: temp1
}
