
interface Animal {
      int eyes = 2;
      void walk() ;

}

class Horse implements Animal{
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}
public class OOPS13 {
    public static void main (String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }
    
}
