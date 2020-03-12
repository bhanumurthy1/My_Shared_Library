def call(String vars)
{ 
  sh '''
    echo \${vars}
    echo ${somevar}
    //java ${somevar}
  '''
}
