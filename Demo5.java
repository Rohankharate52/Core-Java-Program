import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Demo5 { 
    public static void main (String a[] ) throws IDException {


        System.out.println("Enter a number");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num); 

         bf.close(); 

    }
}
