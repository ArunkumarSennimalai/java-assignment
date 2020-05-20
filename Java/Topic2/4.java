import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Payment
{
   private double amount;
   Payment(double amount)
   {
       this.amount=amount;
   }
   
   public double getPaymentAmount()
   {
       return amount;
   }
   public void setPaymentAmount(double amount)
   {
      this.amount = amount; 
   }
   
  public void paymentdetails()
   {  
       System.out.println("The payment amount is "+amount);
        
   }
}

		  
class CashPayment extends Payment
{
    CashPayment(double amount)
    {
        super(amount);
    }
    
    public void paymentdetails()
    {
        System.out.println("Amount to be paid as cash is "+getPaymentAmount());
    }
    
}

class CreditCardPayment extends Payment
{
    String nameOnCard;
    long creditcardNumber;
    Date expiryDate;
    CreditCardPayment(String nameOnCard,long creditcardNumber,String expiryDate,double amount)
    {
        super(amount);
        this.nameOnCard = nameOnCard;
        this.creditcardNumber = creditcardNumber;
        try{
            this.expiryDate = new SimpleDateFormat("yyyy/MM/dd").parse(expiryDate);
        }
        catch (ParseException e)
        {
            System.out.println("Enter the date in yyyy/mm/dd format");
        }
    }
    
    public void paymentdetails()
    {
        System.out.println("Amount to be paid on the card "+creditcardNumber+" with the name "+nameOnCard+" with expiration date " + expiryDate + " is "+getPaymentAmount());
    }
    
}

public class MyClass {
  public static void main(String[ ] args) {
      try {
          CashPayment cp1 = new CashPayment(34556.89);
          cp1.paymentdetails();
          CashPayment cp2 = new CashPayment(1234.32);
          cp2.paymentdetails();
          
          CreditCardPayment cc1 = new CreditCardPayment("ABCD",123456789012345L,"2026/02/08",3456245.56);
          cc1.paymentdetails();
          CreditCardPayment cc2 = new CreditCardPayment("XYZ",890756789012345L,"2040/06/03",3421112.45);
          cc2.paymentdetails();
     }
      catch (Exception e) {
       System.out.println(e);
      }
    }
}