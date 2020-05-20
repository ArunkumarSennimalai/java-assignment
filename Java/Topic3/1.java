import java.util.Scanner;

class AgeException extends Exception 
{ 
    public AgeException(int age) 
    { 
        super(String.valueOf(age)); 
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
            int age = sc.nextInt();
            if(age<18 || age>=60)
                throw new AgeException(age); 
             System.out.println("Name is "+ name);
             System.out.println("Age is "+age);
        } 
        catch (AgeException e) 
        { 
            System.out.println("Age must be between 18 and 59. But you have entered " + e.getMessage());
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    } 
}