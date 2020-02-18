def call(Map pipeline)
{
    pipeline
    {
        agent any 
        stages
        {
            stage("Printing the First parameter")
            {
                echo pipeline.branch
            }
            stage("Printing the second paarmeter")
            {
                echo pipeline.fool
            }
        }
    }
}
