import java.util.HashMap;

class EmployeePhoneNumber
{
    HashMap<String,String> telephonebook;
    
    EmployeePhoneNumber()
    {
      telephonebook = new HashMap<String,String>(); 
    }
    public void mapPhoneNumber(String name,String phonenumber)
    {
        if(phonenumber.length()==10)
            telephonebook.put(name,phonenumber);
        else
            System.out.println("Phone number not valid for "+name);
        
    }
    public String retrivePhoneNumber(String name)
    {
        if(!telephonebook.containsKey(name))
            return "Phone number doesn't exist for the name "+name;
        return telephonebook.get(name);
    }
}

public class MyClass {
    public static void main(String args[]) {
        try{
          EmployeePhoneNumber obj1 = new  EmployeePhoneNumber();
          obj1.mapPhoneNumber("AA","9876543210");
          obj1.mapPhoneNumber("BB","9786512304");
          obj1.mapPhoneNumber("CC","9967812345");
          
          String BBPhonenumber = obj1.retrivePhoneNumber("BB");
          System.out.println("Phone number of BB is "+BBPhonenumber);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}