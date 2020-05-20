class Book
{
   long _isbn;
   String title,author;
   float price; 
   Book(long isbn,String title,String author,float price)
   {
       this._isbn = isbn;
       this.title = title;
       this.author = author;
       this.price = price;
   }
   public void displaydetails()
   {
       System.out.println("Book Title: " + title);
       System.out.println("Book isbn: " + _isbn); 
       System.out.println("Book Author: " + author); 
       System.out.println("Book Price: " + price);
   }
   public float discountedprice(int percent)
   {
       return price*(100-percent)/100;
   }
}
public class MyClass {
  public static void main(String[ ] args) {
      try {
       Book b1 = new Book(12345678,"AA","a1",4200);
       b1.displaydetails();
       float discountedprice1 = b1.discountedprice(10);
       System.out.println("Discounted price of book "+b1.title+" is "+discountedprice1+"\n");
       
       Book b2 = new Book(11109876,"BB","b1",3500);
       b2.displaydetails();
       float discountedprice2 = b2.discountedprice(30);
       System.out.println("Discounted price of book "+b2.title+" is "+discountedprice2);
      }
      catch (Exception e) {
       System.out.println(e);
      }
    }
}