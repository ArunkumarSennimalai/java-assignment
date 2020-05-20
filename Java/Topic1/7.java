import java.util.Scanner;
class NumberOperations
{
   public int factorial(int n) 
   {
      if(n==0)
        return 1;
      else
        return n*factorial(n-1);
    }
}
public class MyClass {
  public static void main(String[ ] args) {
      try {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       NumberOperations obj1 = new NumberOperations();
       int result = obj1.factorial(number);
       System.out.println("Factorial of " + number + " is " + result);
      }
      catch (Exception e) {
       System.out.println(e);
      }
    }
}