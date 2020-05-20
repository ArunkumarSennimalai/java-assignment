package Automobile.TwoWheeler;

import Automobile.Vehicle;
import java.util.Random;

public class Hero extends Vehicle {
    private boolean radioOn = true;
    private int speed;
    private String modelName;
    private String registrationNumber;
    private String ownerName;
     
    Hero(String modelName,String registrationNumber,String ownerName)
    {
      this.modelName = modelName;
      this.registrationNumber = registrationNumber;
      this.ownerName = ownerName;
    }
 
    public int speed()
    { 
      speed = new Random().nextInt(120);
      return speed;
    }
   
    public void radio()
    {
       if(radioOn)
          radioOn=false;
       else
          radioOn=true;
    }
    public String modelName(){
        return modelName;
    } 
    public String registrationNumber()
    {
         return registrationNumber;
    }
    public String ownerName()
    {
         return ownerName;
    } 

    public static void main(String args[]) {
        try{
           Hero h1 = new Hero("AA","AK12 T1234","ow1");
           System.out.println(h1.speed());
           h1.radio();
           System.out.println(h1.modelName());
           System.out.println(h1.registrationNumber());
           System.out.println(h1.ownerName());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}