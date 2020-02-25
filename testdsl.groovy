pipelineJob('Example')
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
              	dum / workspace / spec / streamName('//CDG/CDLG/Services/$serviceName/ML/')
                
            }
                  
                            
        }           
          scriptPath('JenkinsFile')
          lightweight(true)   
        }
    }
  }
   
}
