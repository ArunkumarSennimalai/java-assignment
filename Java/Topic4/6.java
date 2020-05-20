import java.util.HashSet;
import java.util.Iterator;
class FirstClass
{
    protected void finalize()   
    {   
        System.out.println("Finalize method called");   
    }   
}
public class SecondClass
{
     public static void main(String args[]) {
            try{
              FirstClass f = new FirstClass();
              f = new FirstClass();
              f = new FirstClass();
              Runtime.getRuntime().gc() ;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }   
}