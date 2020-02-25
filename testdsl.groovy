def Job = getBinding().getVariables()['Gen_Job_Name'].toString()
def Service_Name=getBinding().getVariables()['Service_Name'].toString()
def Stream_Name="//CDG/CDLG/Services/"+Service_Name+"/ML/"
pipelineJob(Job)
{   
  definition {
        cpsScm {
            scm {
              perforceP4('p4_credentials') {                
            workspace {
                manual('jenkins-${NODE_NAME}-${JOB_NAME}-${EXECUTOR_NUMBER}', ' ')             
            }
                configure { dum ->dum / populate(class:'org.jenkinsci.plugins.p4.populate.ForceCleanImpl'){
                                      have(true)
                                      force(true)            
                                      quiet(true)           
                                      
                                      }
                dum / workspace / spec / clobber('true')                 
              	dum / workspace / spec / streamName(Stream_Name)
                
            }
                  
                            
        }           
          scriptPath('JenkinsFile')
          lightweight(true)   
        }
    }
  }
   
}
