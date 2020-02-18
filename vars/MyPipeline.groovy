def call(String Name)
{    
    echo "Hello Job u r going to run now ,${Name}"   
    build '${Name}'
    echo "Hello Job ur done"
}
