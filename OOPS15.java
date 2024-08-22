
class Student {
    String name ;
    static String school;
    public static Student student1;

    public static void changeSchool() {
        school = "newshool";
    }
}


public class OOPS15 {
    public static void main (String args[]) {
        Student.school = "ABC";
        Object student1;
        Student.student1 = new Student();
        student1.name = "tony";
        System.out.println(student1.school);
    }
}