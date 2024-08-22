













//constrotor in java...2  
class Human 
{
   private int age;
   private  String name;




   
public Human()     //defalutt constrotor..
{  

   age = 12;
   name ="john";
}
public Human(String name) {
    this.age = 12;
    this.name =name;
}

public Human(int age, String name) {   //parametrizd constroctor...

    this.age = age;
    this.name = name;
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

public class Demo4
{
    public static void main (String a[]) 
    {
        Human obj = new Human();
        Human obj1 = new Human("navin");
        System.out.println(obj.getName() + " : " +obj.getAge());
         
//System.out.println(obj1.getName() + " : " +obj1.getAge());
         //obj.setAge(30);
//obj.setName("reddy");

      //  System.out.println(obj.getName() + " : " +obj.getAge());


    }
}
