import java.util.Scanner;
class NumberOperations
{
   public int greatestNumber(int[] array,int n) 
   {
      int max = array[0];
      for(int i=1;i<n;i++)
      {
         if(array[i]>max)
         {
             max = array[i];
         }
      }
      return max;
    }
}
public class MyClass {
  public static void main(String[ ] args) {
      try {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array: ");
       int n = sc.nextInt();
       int array[] = new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<n;i++)
       {
           array[i] = sc.nextInt();
       }
       NumberOperations obj1 = new NumberOperations();
       int greatestNumber = obj1.greatestNumber(array,n);
       System.out.println("Greatest number in the array is " + greatestNumber);
       
      }
      catch (Exception e) {
       System.out.println(e);
      }
    }
}