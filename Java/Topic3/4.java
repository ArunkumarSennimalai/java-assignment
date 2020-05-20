import java.util.Scanner;

class StringOperations
{
    public boolean isPalindrome(String str1)
    {
        int length = str1.length();
        int end = length -1;
        int i;
        for(i=0;i<length/2;i++)
        {
            if(str1.charAt(i) != str1.charAt(end))
               break;
            end--;
        }
        if(i==length/2)
           return true;
        return false;
    }
}
public class MyClass
{ 
    public static void main(String args[]) 
    { 
        
        try
        { 
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            
            StringOperations obj1 = new StringOperations();
            if (obj1.isPalindrome(name))
               System.out.println(name + " is a palindrome");
            else
               System.out.println(name + " is not a palindrome");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
   
}