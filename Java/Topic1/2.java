class MathematicalOperations{
    public void example1()
    {
        int val1 = -5;
        int val2 = 8;
        int val3 = 6;
        int result = val1+val2*val3;
        System.out.println(" -5 + 8 * 6 = "+result);
    }
     public void example2()
    {
        int val1 = 55;
        int val2 = 9;
        int val3 = 9;
        int result = (val1+val2)%val3;
        System.out.println(" ( 55 + 9 ) % 9 = "+result);
    }
     public void example3()
    {
        int val1 = 20;
        int val2 = -3;
        int val3 = 5;
        int val4 = 8;
        float result = val1+val2*val3/val4;
        System.out.println(" 20 + -3 * 5 / 8  = "+(int)result);
    }
     public void example4()
    {
        int val1 = 5;
        int val2 = 15;
        int val3 = 3;
        int val4 = 2;
        int val5 = 8;
        float result = val1+val2/val3*val4-val5%val3;
        System.out.println(" 5 + 15 / 3 * 2 - 8 % 3 = "+(int)result);
    }
}

public class MyClass {
  public static void main(String[ ] args) {
    try {
        MathematicalOperations obj1 = new MathematicalOperations();
        obj1.example1();
        obj1.example2();
        obj1.example3();
        obj1.example4();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}