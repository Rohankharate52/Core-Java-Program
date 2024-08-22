
//dynamic mehtod dispatch in java....


class A 
{  
    public void show() 
    {
        System.out.println("in Show");
    }

}
class B extends A
{

}


public class OOPS17{
    public static void main (String a[])
    {
          A obj= new B();
          obj.show();
    }
}