package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Program13
{
    int a,b,c;
    public void average()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter value for A :");
        a = sc.nextInt();
        System.out.println("Enter value for B :");
        b = sc.nextInt();
        System.out.println("Enter value for c :");
        c = sc.nextInt();

        int avg= (a+b+c)/3;
        System.out.println("Average of three numbers are : " + avg);

    }

    public static void main(String[] args)
    {
        Program13 p13 = new Program13();
        p13.average();
    }

}
