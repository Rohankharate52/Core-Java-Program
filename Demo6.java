
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Demo6 { 
    public static void main (String a[] )  {


        System.out.println("Enter a number");

       // InputStreamReader in = new InputStreamReader(System.in);
       // BufferedReader bf = new BufferedReader(in);
      
       Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        System.out.println(num); 

         

    }
}
