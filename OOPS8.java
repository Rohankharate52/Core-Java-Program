


//multi  level inheritance ,,,,,1 base class and derive class 
class Shape{
    public void area() {
     System.out.println("display area");
    }
 }
 class Triangle extends Shape {
     public void area(int l, int h) {
         System.out.println(1/2*l*h);
 
     }
 }
 class EquilateralTriangle extends Triangle{
    public void area(int l,int h) {
        System.out.println(1/2*l*h); 
    }
 }
 
 
 
 public class OOPS8 {
     public static void main (String a[] ) {
 
     }
 }