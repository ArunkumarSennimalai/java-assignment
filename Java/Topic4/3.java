import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Employee
{
    int eCode;
    String name;
    double salary;
    String mailId;
    double net_salary;
    Employee()
    {
    }
    Employee(int eCode,String name,double salary,String mailId)
    {
        setEmployeeDetails(eCode,name,salary,mailId);
    }
    
    public void setEmployeeDetails(int eCode,String name,double salary,String mailId)
    {
        this.eCode = eCode;
        this.name = name;
        this.salary = salary;
        this.mailId = mailId;
        net_salary = salary - 0.12*salary - 0.0001*salary; 
    }
    public void getEmployeeDetails()
    {
        System.out.println("EmployeeCode: "+eCode);
        System.out.println("Employee Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("MailId: "+mailId);
    }
   
}
public class EmployeeDB
{ 
    List<Employee> employeelist = new ArrayList<Employee>();
    
    public boolean addEmployee(Employee emp)
    {
        try
        {
           employeelist.add(emp);   
        }
        catch(Exception e)
        {
           System.out.println("Employee not added");
           return false;    
        }
        System.out.println("Employee with empid "+emp.eCode + " added successfully");
        return true;
    }
    public boolean deleteEmployee(int eCode)
    {
        for(Employee emp: employeelist)
        {
           if(emp.eCode == eCode)
           {
               employeelist.remove(emp);
               System.out.println("Employee with empid "+ eCode + " deleted successfully");
               return true;
           }
        }
        System.out.println("Employee not found");
        return false;
    }
    public String showPaySlip(int eCode)
    {
        String msg = "Employee not found";
        for(Employee emp: employeelist)
        {
           if(emp.eCode == eCode)
           {
               msg = "Gross salary is "+emp.salary + ". Net Salary after detecting pf and scf is "+emp.net_salary;
               break;
           }
        }
        return msg;
        
    }
    public Employee[] listAll()
    {
       return employeelist.toArray(new Employee[0]); 
    }
    public static void main(String args[]) 
    { 
        
        try
        { 
            Employee emp1 = new Employee(101,"AA",43553,"aa@zz.com");
            Employee emp2 = new Employee(102,"BB",521212,"bb@zz.com");
            Employee emp3 = new Employee(103,"CC",63553,"cc@zz.com");
        
            EmployeeDB obj1 = new EmployeeDB();
            
            obj1.addEmployee(emp1);
            obj1.addEmployee(emp3);
            obj1.addEmployee(emp2);
            
            obj1.deleteEmployee(103);
            
            String msg = obj1.showPaySlip(102);
            System.out.println("Salary Details:"+msg);
            
            Employee emparray[] = obj1.listAll();
            for(int i=0;i<emparray.length;i++)
            {
                 emparray[i].getEmployeeDetails();
                  System.out.println();
            }
            
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
   
}