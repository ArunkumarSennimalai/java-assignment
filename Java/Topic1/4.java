import java.util.Scanner;
class Calendar
{
   public void printMonthInWords(int month) {
      String monthname ="";
      switch(month)
      {
          case 1:
              monthname="January";
              break;
          case 2:
              monthname="February";
              break;
          case 3:
              monthname="March";
              break;
          case 4:
              monthname="April";
              break;
          case 5:
              monthname="May";
              break;
          case 6:
              monthname="June";
              break;
          case 7:
              monthname="July";
              break;
          case 8:
              monthname="August";
              break;
          case 9:
              monthname="September";
              break;
          case 10:
              monthname="October";
              break;
          case 11:
              monthname="November";
              break;
          case 12:
              monthname="December";
              break;
          default:
              monthname = "Enter valid month";
      }
      System.out.println(monthname);
    }
}
public class MyClass {
  public static void main(String[ ] args) {
      try {
       Scanner sc = new Scanner(System.in);
       int month = sc.nextInt();
       Calendar obj1 = new Calendar();
       obj1.printMonthInWords(month);
      }
      catch (Exception e) {
       System.out.println(e);
      }
    }
  
 
}