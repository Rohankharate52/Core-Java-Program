

import java.util.*;
import bank;


//hirachial  level inheritance ,,,,,1 base class and derive class 
class Shape{
    public void area() {
     System.out.println("display area");
    }
 }
 class Triangle extends Shape {
     public void area(int l, int h) {   //base class shape class hai aur 
         System.out.println(1/2*l*h);
 
     }
 }
 
 class Circle extends Shape {
    public void area (int r) {         // eski bhi base class shpape clas  ahi 
        System.out.println((3.14)*r*r);
    }
 }

 
 
 
 public class OOPS10{
     public static void main (String a[] ) {
           bank.Account account1 = new bank.Account();
           account1.name = "customer1";
     }
 }