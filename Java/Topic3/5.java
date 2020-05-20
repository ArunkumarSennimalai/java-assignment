import java.util.Scanner;

class StringOperations
{
    public long countOccurrences(String str1,char c)
    {
      return str1.chars().filter(x -> x == c).count();
    }
}
public class MyClass
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();
            char c = sc.next().charAt(0);
            
            StringOperations obj1 = new StringOperations();
            long count = obj1.countOccurrences(str1,c);
            System.out.println(" Number of occurrence of "+c+" is "+count);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
   
}