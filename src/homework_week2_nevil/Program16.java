package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Program16
{
    String binary1,binary2;

    public void addition()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first Binary Number :");
        binary1=sc.nextLine();
        System.out.println("Input second Binary Number :");
        binary2=sc.nextLine();
        int num1 = Integer.parseInt(binary1,2);
        int num2 = Integer.parseInt(binary2,2);
        int sum=num1 + num2;
        System.out.println("Sum of two binary numbers : "+ Integer.toBinaryString(sum));

    }

    public static void main(String[] args)
    {
        Program16 p16 =new Program16();
        p16.addition();
    }
}
