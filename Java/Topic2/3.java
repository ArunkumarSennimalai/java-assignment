class Book
{
   long _isbn;
   String title;
   float price; 
   Book(long isbn,String title,float price)
   {
       this._isbn = isbn;
       this.title = title;
       this.price = price;
   }
   public void displaydetails()
   {
       System.out.println("Book Title: " + title);
       System.out.println("Book isbn: " + _isbn); 
       System.out.println("Book Price: " + price);
   }
   public float discountedprice(int percent)
   {
       return price*(100-percent)/100;
   }
}

class Magazine extends Book
{
    String type;
    Magazine(long isbn,String title,String type,float price)
    {
        super(isbn,title,price);
        this.type = type;
    }
    public void displaydetails()
    {
       super.displaydetails();
       System.out.println("Book Type: " + type);
    }
}
class Novel extends Book
{
    String author;
    Novel(long isbn,String title,String author,float price)
    {
       super(isbn,title,price);
       this.author = author;
    }
    public void displaydetails()
    {
       super.displaydetails();
       System.out.println("Book Author: " + author);
    }
    
}
public class MyClass {
  public static void main(String[ ] args) {
      try {
       Magazine m1 = new Magazine(12345678,"AA","Thriller",4200);
       m1.displaydetails();
       float discountedprice1 = m1.discountedprice(10);
       System.out.println("Discounted price of book "+m1.title+" is "+discountedprice1+"\n");
       
       Novel n1 = new Novel(11109876,"BB","b1",3500);
       n1.displaydetails();
       float discountedprice2 = n1.discountedprice(30);
       System.out.println("Discounted price of book "+n1.title+" is "+discountedprice2); 
      }
      catch (Exception e) {
       System.out.println(e);
      }
    }
}