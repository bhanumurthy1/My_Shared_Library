def call(String WSName,String StreamName)
{ 
  def Credentials="b8680df8-55d9-4978-b0f5-7fb317e8d1fb"
  
  
  checkout perforce(credential: Credentials,
                    populate: forceClean(have: true, parallel: [enable: false, minbytes: '1024', minfiles: '1', threads: '4'], pin: '', quiet: true),
                    workspace: manualSpec(charset: 'none', cleanup: false, name: WSName, pinHost: false,
                    spec: clientSpec(allwrite: false, backup: true, changeView: '', clobber: true, compress: false, line: 'LOCAL',
                    locked: false, modtime: false, rmdir: false, serverID: '', streamName: StreamName, type: 'WRITABLE', view: ''))) 
  
}
