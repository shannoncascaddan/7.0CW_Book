public class Dictionary2 extends Book2
{
    private int definitions;
    public Dictionary2(int numPages, int numDefinitions)
    {
        super(numPages);
        definitions = numDefinitions;
    }//end constructor
    public void definitionMessage()
    {
        System.out.println("Number of definitions: "+ definitions);
        System.out.println("Definitions per page: "+definitions/pages);
    }//end method to print info about definitions
}//end class Dictionary2

