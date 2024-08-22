


//encapsulation java....  
class Human 
{
   private int age;
   private  String name;

   public int getAge() 
   {
    return age;

   }
   public void setAge(int a) 
   {
    age = a;
   }
   public String getName()
   {
     return name;
   }
   public void setName(String n) 
   {
     name =n; 
   }

}

public class Demo 
{
    public static void main (String a[]) 
    {
        Human obj = new Human();
        obj.setAge(30);
         obj.setName("reddy");

        System.out.println(obj.getName() + " : " +obj.getAge());


    }
}
