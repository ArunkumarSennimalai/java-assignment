public class MyClass {
   private static void printCurrentTime()
    {
      System.out.println(java.time.LocalTime.now());  
    }
             
  public static void main(String[] args)
  {
    long startTime = System.currentTimeMillis();
    while (System.currentTimeMillis() <= startTime + 20000)
    {
      printCurrentTime();
      try
      {
        Thread.sleep(2000);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}