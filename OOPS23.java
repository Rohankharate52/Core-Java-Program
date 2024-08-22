
//exception handing in java
// try catch...............

public class OOPS23 {
    public static void main(String a[]) {
        int i=0;
        int j=0;


        try 
        {
            j = 18/i;
        }
        catch (Exception e) 
        {
            System.out.println("Something in wrong");

        }

        System.out.println(j);
        System.out.println("bye");
    }
}
