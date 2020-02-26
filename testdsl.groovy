def Job_Name = getBinding().getVariables()['Gen_Job_Name'].toString()
def Service_Name=getBinding().getVariables()['Service_Name'].toString()
def Stream_Name="//CDG/CDLG/Services/"+Service_Name+"/ML/"
pipelineJob(Job_Name)
{   
  definition {
        cpsScm {
            scm {
              perforceP4('e4075f26-85de-45c4-b9aa-96252589c01b') {                
            workspace {
                manual('jenkins-${NODE_NAME}-${JOB_NAME}-${EXECUTOR_NUMBER}', ' ')             
            }
                configure { pointer ->pointer / populate(class:'org.jenkinsci.plugins.p4.populate.ForceCleanImpl'){
                                      have(true)
                                      force(true)            
                                      quiet(true)           
                                      
                                      }
                pointer / workspace / spec / clobber('true')                 
              	pointer / workspace / spec / streamName(Stream_Name)
                
            }
                  
                            
        }           
          scriptPath('JenkinsFile')
          lightweight(true)   
        }
    }
  }
   
}
