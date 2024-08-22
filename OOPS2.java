


class Pen {
    String color ;
    String type; 

    public void write() {
        System.out.println("wrtiing something");

    }
    public void printColor() {
        System.out.println(this.color);
    }
};


class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.err.println(this.age);

    }
}

public class OOPS2 {
    
public static void main (String arge[] ){
    Student s1 = new Student();
    s1.name = "shradha";
    s1.age=22;

    s1.printInfo();
  
}
}