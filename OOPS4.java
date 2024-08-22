
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.err.println(this.age);

    }

    Student (String name ,int age) {   //parametrixed constrtootr ...
        this.name= name;
        this.age = age;

      }

    }



public class OOPS4 {
    
public static void main (String arge[] ){
    Student s1 = new Student("aman",24);

    s1.printInfo();
  
}

}