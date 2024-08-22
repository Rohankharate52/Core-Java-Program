

//abstraction....




abstract class Animal {
    abstract void walk();
    Animal() 
    {
         System.out.println("You are creating a new anilal");

    } 
    public void eat() {
        System.out.println("Animal eats");

    }
}


class Horse extends Animal {
    Horse () {
        System.out.println("Created a house ");
    }
    public void walk() {
       System.out.println("walk on 4 legs");

    }
} 


class Chicken extends Animal {
    public void walk () {
        System.out.println("walks on 2 legs");

    }
}

public class OOPS12 {
    public static void main (String args[]){
        Horse horse = new Horse();
        //horse.walk();
  
        // Animal animal = new Animal() ;
        //animal.walk();
    }
}




