import java.util.Scanner;
class NumberOperations
{
   public int sumOfDigits(int number) {
      int i=4;
      int sum=0;
      while(number>0)
      {
       sum += number%10;
       number /=10;
      }
      return sum;
    }
}
public class MyClass {
  public static void main(String[ ] args) {
      try {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       NumberOperations obj1 = new NumberOperations();
       int sum = obj1.sumOfDigits(number);
       System.out.print("Sum of digits of "+ number + " is "+sum);
      }
      catch (Exception e) {
       System.out.println(e);
      }
    }
}