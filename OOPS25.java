

public class OOPS25
{
    public static void main (String a[]){
        int i=20;
        int j =0;

        try {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException( "i dont want to print zero");

        }
        catch(ArithmeticException e) {
            j = 18/1;
            System.out.println("this the default output");

        }
        catch(Exception e) {
            System.out.println("Something went wrong" + e);

        }
        System.out.println(j);
        System.out.println("bye");

    }
}