

//dynamic mehtod dispatch in java....


class A 
{  
    public void show() 
    {
        System.out.println("in A Show");
    }

}
class B extends A
{
    public void show() 
    {
        System.out.println("in B Show");
    }
    
}
class C extends A{
    public void show() 
    {
        System.out.println("in C Show");
        
    }
    
}


public class OOPS18{
    public static void main (String a[])
    {
          A obj= new A();
          obj.show();

          obj = new B();
          obj.show();

          obj = new C();
          obj.show() ;
    }
}