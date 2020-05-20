import java.util.HashSet;
import java.util.Iterator;

public class MyClass {
    public static void main(String args[]) {
        try{
          HashSet<String> employeename = new HashSet<String>();
          employeename.add("AA");
          employeename.add("BB");
          employeename.add("ZZ");
          employeename.add("DD");
          printEmployeeNames(employeename);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void printEmployeeNames(HashSet<String> employeename)
    {
      Iterator<String> itr = employeename.iterator();
      while(itr.hasNext())
         System.out.println(itr.next());   
    }
}