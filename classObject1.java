
class Calculator
{

    int a;
    public int add()
    {
        System.out.println("in add");
        return 0;

    }
}

public class classObject1 {
    public static void main(String a[])
    {
        int num1=4;
        int num2=5;

        Calculator calc = new Calculator();
        int result = calc.add();


        //int result = num1 + num2;

       System.out.println(result);

    }
    
}
