import java.util.Scanner;
class Calendar
{
   public String minutesToYearsAndDays(Long minutes) {
       Long years = minutes/(60*24*365);
       Long remainingDays = (minutes%(60*24*365))/(60*24);
       return years+" years and "+remainingDays+" days";
    }
}
public class MyClass {
  public static void main(String[ ] args) {
      try {
       Scanner sc = new Scanner(System.in);
       Long minutes = sc.nextLong();
       String result  = new Calendar().minutesToYearsAndDays(minutes);
       System.out.println(result);
      }
      catch (Exception e) {
       System.out.println(e);
      }
    }
  
 
}