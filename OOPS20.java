

//final 

//final - variable method class

class Calc 
{
    public void show() 
    {
        System.out.println("in Calu show");
    }
    public void add(int a ,int b) 
    {
        System.out.println(a+b);

    }
}



public class OOPS20
{
    public static void main (String a[]) 
    {   
      Calc obj = new Calc();
      obj.show();
      obj.add(4,5);

    } 
}
