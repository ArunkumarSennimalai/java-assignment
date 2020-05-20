package Automobile.TwoWheeler;

import Automobile.Vehicle;
import java.util.Random;

public class Honda extends Vehicle {
    private int speed;
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private String cdplayer;
     
    Honda(String modelName,String registrationNumber,String ownerName)
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
   
    public void cdplayer(String command)
    {
       if(command=="on")
          System.out.println("Cdplayer turned on");
          cdplayer = "on";
       else if(command=="off")
          System.out.println("Cdplayer turned off");
          cdplayer = "off";
      else if(command=="pause")
          System.out.println("Cdplayer paused");
          cdplayer = "paused";
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
           Honda h1 = new Honda("DD","MN12 F3432","ow1");
           System.out.println(h1.speed());
           h1.cdplayer("on");
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