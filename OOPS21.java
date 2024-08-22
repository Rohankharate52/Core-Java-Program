



//final 

//final - variable method class
//class 
  class Calc 
{
    public void show() 
    {
        System.out.println("by rohan");
    }
    public void add(int a ,int b) 
    {
        System.out.println(a+b);

    }
}

class AdvCalc extends Calc{
  

    public void show()
    {
        System.out.println("by jojso");
    }
}

public class OOPS21
{
    public static void main (String a[]) 
    {   
      AdvCalc obj = new AdvCalc();
      obj.show();
      obj.add(4,5);

    } 
}
