class Document
{
   private String text; 
   public String toString()
   {
       return text;
   }
   public void setText(String text)
   {
       this.text = text;
   }
}

class Email extends Document
{
    private String  sender, recipient, title;
    
    
    public String getSender()
    {
        return sender;
    }
    public String getRecipient()
    {
        return recipient;
    }
    public String getTitle()
    {
        return title;
    }
    public String getBody()
    {
        return super.toString();
    }
    public void setMail(String sender,String recipient,String title,String body)
    {
       this.sender = sender;
       this.recipient = recipient;
       this.title = title;
       setText(body);
    }
    public String toString()
    {
       return "Sender:"+ sender + " Recipient:" + recipient + " Title:" + title + " Body:" + super.toString();
    }
}

public class MyClass {
  public static void main(String[ ] args) {
      try {
       Document d1 = new Document();
       d1.setText("Sample message");
       System.out.println(d1.toString());
       
       Email e1 = new Email();
       e1.setMail("aa@zz.com","bb@zz.com","Confirmation message","Congratulations your order has been placed");
       
       String recipient = e1.getRecipient();
       System.out.println(recipient);
       
       String body = e1.getBody();
       System.out.println(body);
       
       String maildata = e1.toString();
       System.out.println(maildata);
      }
      catch (Exception e) {
       System.out.println(e);
      }
    }
}