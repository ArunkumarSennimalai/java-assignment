import java.util.Scanner;

class Student 
{ 
    private String name;
    private int mark1,mark2,mark3;
    public Student()
    {
    }
    public Student(String name,String mark1,String mark2,String mark3) 
    { 
       setName(name);
       setMarks(mark1,mark2,mark3);
    }
    
    public int averageMark()
    {
        return (mark1+mark2+mark3)/3;
    }
    public void setName(String name)
    {
        this.name = name;
           System.out.println(this.name);
    }
    public void setMarks(String mark1,String mark2,String mark3)
    {
        try{
           this.mark1 = Integer.parseInt(mark1);
          System.out.println(this.mark1);
           this.mark2 = Integer.parseInt(mark2);
           System.out.println(this.mark2);
           this.mark3 = Integer.parseInt(mark3);
           System.out.println(this.mark3);
        }
        catch(NumberFormatException e)
        {
          System.out.println("Mark  entered must be integer");  
        }
        
    }
    public String getName(String name)
    {
        return name;
    }
    public int[] getMarks()
    {
      int array[] = {mark1,mark2,mark3};
      return array;
    }
   
} 
  
public class MyClass 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            Scanner sc = new Scanner(System.in);
            
            String s1name = sc.next();
            String s1mark1 = sc.next();
            String s1mark2 = sc.next();
            String s1mark3 = sc.next();
            Student s1 = new Student(s1name,s1mark1,s1mark2,s1mark3);
            int s1avg = s1.averageMark();
            System.out.println("Average of s1 is "+s1avg);
            
            String s2name = sc.next();
            String s2mark1 = sc.next();
            String s2mark2 = sc.next();
            String s2mark3 = sc.next();
            Student s2 = new Student();
            s2.setName(s2name);
            s2.setMarks(s2mark1,s2mark2,s2mark3);
            int s2avg = s2.averageMark();
            System.out.println("Average of s2 is "+s2avg);
        } 
        catch (Exception e)
        {
            System.out.println(e);
        }
    } 
}