package homework_week2_nevil;

import java.util.Scanner;

/**
*   1. Write a Java programme using the following steps.
*   1.1 Declare two instance variables.
*   1.2 Declare one instance method.
*   1.3 Call both instance variables into the instance method inside the print statement.
*   1.4 Declare the Main method.
*   1.5 Call the above instance method into the Main method and Run the programme.
*/
public class Program1
{
    //Declare two instance variable
    int a,b;
    // Main Method
    public static void main(String[] args)
    {
        System.out.println("\n");
        //Calling Method M1
        Program1 p1 = new Program1();
        p1.M1();
    }

    //Declare Instance Method
    public void M1()
    {
        //Reading two numbers from Console
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a = ");
        a=sc.nextInt();
        System.out.print("Enter value for b = ");
        b=sc.nextInt();
        System.out.println("Instance Variable are a = " + a + " b = "+ b );
    }

}
