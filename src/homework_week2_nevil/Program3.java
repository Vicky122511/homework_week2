package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program3
{
    //Instance variable a
    int a=10;

    //Static variable b
    static int b;

    //Declare Static method m1
    public static void m1()
    {
        System.out.println("Calling Static Method");
        Program3 p1 = new Program3();
        System.out.println("Instant variable a = " + p1.a);
        System.out.println("Static variable b =" +b);
    }

    //Declare Instance method m2
    public void m2()
    {
        System.out.println("Calling Instance Method");
        System.out.println("Instant variable a = " +a);
        System.out.println("Static variable b =" +b);
    }

    //Main method
    public static void main(String[] args)
    {

        System.out.println("\n");
        //Object creation
        Program3 p1 = new Program3();

        Scanner sc = new Scanner(System.in);
       System.out.print("Enter value a = ");
        p1.a=sc.nextInt();
        System.out.print("Enter value b = ");
        b=sc.nextInt();
        System.out.println("\n");
        //Calling Static Method
        m1();

        //Calling Instance Methode
        p1.m2();
    }


}
