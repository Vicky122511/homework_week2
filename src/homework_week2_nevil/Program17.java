package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Program17
{
    int a;

    public void binary()
    {
        int remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number : ");
        a= sc.nextInt();
        System.out.println("Binary numbers : "+ Integer.toBinaryString(a));
    }

    public static void main(String[] args)
    {
        Program17 p17 = new Program17();
        p17.binary();
    }
}
