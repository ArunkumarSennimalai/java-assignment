import java.util.Scanner;
import java.util.ArrayList;
import java.util.NoSuchElementException;
 
public class MyClass
{ 
    public static void main(String args[]) 
    { 
        
        try
        { 
            Scanner sc = new Scanner(System.in);
            
            ArrayList<Integer> arraylist = new ArrayList<Integer>();
            try{
                for(int i=0;i<5;i++)
                {
                    arraylist.add(sc.nextInt());
                }
             }
            catch(NoSuchElementException e){
                System.out.println("Entered Less the 5 elements");
            }
            
            Integer[] array = arraylist.toArray(new Integer[0]);
            int averagevalue = average(array);
            System.out.println("Average = "+ averagevalue);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static int average(Integer[] array)
    {
        int sum=0;
        try{
            for(int i=0;i<5;i++)
            {
                sum += array[i];
            }
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           System.out.println("Less than 5 elements in the array");
           System.exit(0);
        }
        return sum/5;
    }
}