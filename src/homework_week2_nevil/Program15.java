package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Program15
{
    int a,b,c;

    public void swap()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of A : ");
        a=sc.nextInt();
        System.out.println("Enter value of B : ");
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("\n");
        System.out.println("Value of A : "+a);
        System.out.println("Value of B : "+b);

    }

    public static void main(String[] args)
    {
        Program15 p15 =new Program15();

        p15.swap();
    }

}
