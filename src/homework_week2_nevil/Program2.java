package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Program2
{
    //Declare two static variables
    static int a,b;
    public static void main(String[] args)
    {
        System.out.println("\n");
        //Reading values from Console
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a = ");
        a=sc.nextInt();
        System.out.print("Enter value b = ");
        b= sc.nextInt();

        //Calling static method m1
        m1();
    }

    // Declare static method m1
    public static void m1()
    {
        //Printing two static variable
        System.out.println("Static variables are a = " + a + "and b = "+b);
    }

}
