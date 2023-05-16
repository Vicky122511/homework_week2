package homework_week2_nevil;


import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 *  and division methods all with parameters and use string concatenation
 *  methods.(Note: Two static and Two instance methods.)
*/
 public class Program5
{

    public static void main(String[] args)
    {
        Program5 p5 = new Program5();

        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("\n");
        System.out.println("Enter value for a =");
        a=sc.nextInt();
        System.out.println("Enter value for b =");
        b=sc.nextInt();

        //Calling Static Methods
        addition(a,b);
        subtraction(a,b);

        //Calling Instance Methods
        p5.multiplication(a,b);
        p5.division(a,b);


    }

    //Declare Static method addition & subtraction
    public static void addition(int a,int b)
    {
        System.out.println("Addition of a + b ("+ a + " + " + b +") = "+(a+b) );
    }

    public static void subtraction(int a, int b)
    {
        System.out.println("Subtraction of a - b ("+ a + " - " + b +") = "+(a-b) );
    }

    //Declaration of Instance Method Multiplication & Division
    public void multiplication(int a, int b)
    {
        System.out.println("Multiplication of a * b ("+ a + " * " + b +") = "+(a*b) );
    }

    public void division(int a, int b)
    {
        System.out.println("Division of a / b ("+ a + " / " + b +") = "+(a/b) );
    }
}
