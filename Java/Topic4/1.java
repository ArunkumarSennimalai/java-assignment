import java.util.Random;

class ThreadExample extends Thread{  
    public void run(){  
      System.out.println("thread is running...");  
    }  
    
    public void factorial(long n)
    {
        long fact=1;
        for(int i=2;i<=n;i++)
            fact *= i;
        System.out.println("Factorial of "+n+" : "+fact);
    }
    public void printNum(int n)
    {
        System.out.println("Number: "+n);
    }
 }  

public class MyClass
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            ThreadExample t1=new ThreadExample(); 
            ThreadExample t2=new ThreadExample();  
            t1.start();
            t2.start();
            Random random  = new Random();
            int num;
            for(int i=1;i<=5;i++)
            {
               num = random.nextInt(20);
               t1.printNum(num);
               t2.factorial(num);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
   
}