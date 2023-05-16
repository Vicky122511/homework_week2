package homework_week2_nevil;

import java.util.Scanner;

/** Write a Java programme using the following steps.
*    4.1 Declare two instance and two static variables.
*    4.2 Declare one instance method.
*    4.3 Declare one static method.
*    4.4 Call all four instance and static variables into both instance and static methods inside the
*    print statement.
*    4.5 Declare the Main method.
*    4.6 Call both instance and static methods into the Main method and run the programme.
*/


 public class Program4
{
    //Two instance variable
    int a,b;

    //Two static variable
    static int c,d;

    public static void main(String[] args)
    {
        System.out.println("\n");
        Program4 p4 = new Program4();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a = ");
        p4.a = sc.nextInt();
        System.out.print("Enter value for b = ");
        p4.b = sc.nextInt();
        System.out.print("Enter value for c = ");
        c = sc.nextInt();
        System.out.print("Enter value for d = ");
        d = sc.nextInt();

        System.out.println("\n");
        //Calling both Instance and Static Method
        p4.m1();
        System.out.println("\n");
        m2();
    }

    //Declare Instance Method
    public void m1()
    {
        System.out.println("Calling Instance Method \n");
        System.out.println(" Instance Variable a = "+a);
        System.out.println(" Instance Variable b = "+b);
        System.out.println(" Instance Variable c = "+c);
        System.out.println(" Instance Variable d = "+d);
    }

    //Declare Static Method
    public static void m2()
    {
        System.out.println("Calling Static Method \n");
        System.out.println(" Instance Variable a = ");
        System.out.println(" Instance Variable b = ");
        System.out.println(" Instance Variable c = "+c);
        System.out.println(" Instance Variable d = "+d);
    }

}
