import java.util.Scanner;

abstract class Instrument
{
  public abstract void play();
}

		  
class Piano extends Instrument
{
    
    public void play()
    {
        System.out.println("Piano is playing  tan tan tan tan");
    }
    
}

class Flute extends Instrument
{
    
    public void play()
    {
        System.out.println("Flute is playing  toot toot toot toot");
    }
    
}
class Guitar extends Instrument
{
    
    public void play()
    {
        System.out.println("Guitar is playing  tin  tin  tin");
    }
    
}


public class MyClass {
  public static void main(String[ ] args) {
      try {
          Instrument[] instrument = new Instrument[10];
          for(int i=0;i<3;i++)
              instrument[i] = new Piano(); 
          for(int i=3;i<6;i++)
              instrument[i] = new Flute();
          for(int i=6;i<10;i++)
              instrument[i] = new Guitar();
        
         MyClass obj1 = new MyClass();
         obj1.playInstrument(instrument);
         obj1.checkinstance(instrument);
      }
      catch (Exception e) {
       System.out.println(e);
      }
    }
    
   public void playInstrument(Instrument[] instrument)
   {
       for(int i=0;i<10;i++)
       {
           instrument[i].play();
       }
   }
   public void checkinstance(Instrument[] instrument)
   {
       for(int i=0;i<10;i++)
       {
           String str1="";
           if(instrument[i] instanceof Piano)
               str1 = "Piano";
           else if(instrument[i] instanceof Flute)
               str1 = "Flute";
           else if(instrument[i] instanceof Guitar)
               str1 = "Guitar";
           System.out.println("instrument["+i+"] is instance of "+str1);
           
       }
   }
}