
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.err.println(this.age);

    }
    Student () {
        System.out.println("constrotor called");
    }
}



public class OOPS3 {
    
public static void main (String arge[] ){
    Student s1 = new Student();
    s1.name = "shradha";
    s1.age=22;

    s1.printInfo();
  
}

}