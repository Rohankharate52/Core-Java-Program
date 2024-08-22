




abstract class Animal {
    public void walk() {

    } 
}

class Horse extends Animal {
    public void walk() {
       System.out.println("walk on 4 legs");

    }
} 


class Chicken extends Animal {
    public void walk () {
        System.out.println("walks on 2 legs");

    }
}

public class OOPS11 {
    public static void main (String args[]){
        Horse horse = new Horse();
        horse.walk();
  
        // Animal animal = new Animal() ;
        //animal.walk();
    }
}




