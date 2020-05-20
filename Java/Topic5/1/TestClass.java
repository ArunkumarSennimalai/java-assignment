import testpackage.Foundation;

public class Test
{
    public static void main(String args[]) {
        try{
            Foundation f1 = new Foundation();
            //f1.var1=1;
            //f1.var2=1;
            //f1.var3=1;
            //only var4 is accessible
            f1.var4=1;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}

