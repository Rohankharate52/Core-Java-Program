






//constrotor in java...
class Human 
{
   private int age;
   private  String name;

   public Human () 
  {
        System.out.println( "in constructor ");
  }

   public int getAge() 
   {
    return age;

   }
   public void setAge(int age ) 
   {
       this.age = age;
   }
   public String getName()
   {
     return name;
   }
   public void setName(String name) 
   {
      this.name = name;
   }

}

public class Demoo
{
    public static void main (String a[]) 
    {
        Human obj = new Human();
        Human obj1 = new Human();
        System.out.println(obj.getName() + " : " +obj.getAge());

         obj.setAge(30);
         obj.setName("reddy");

      //  System.out.println(obj.getName() + " : " +obj.getAge());


    }
}
