package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class Program10
{
    int a;

    public void table()
    {
        int i=1;
        System.out.println(a+" * "+ i +" = "+ (a*1)); i++;
        System.out.println(a+" * "+ i +" = "+ (a*2) ); i++;
        System.out.println(a+" * "+ i +" = "+ (a*3) ); i++;
        System.out.println(a+" * "+ i +" = "+ (a*4) ); i++;
        System.out.println(a+" * "+ i +" = "+ (a*5) ); i++;
        System.out.println(a+" * "+ i +" = "+ (a*6) ); i++;
        System.out.println(a+" * "+ i +" = "+ (a*7) ); i++;
        System.out.println(a+" * "+ i +" = "+ (a*8) ); i++;
        System.out.println(a+" * "+ i +" = "+ (a*9) ); i++;
        System.out.println(a+" * "+ i +" = "+ (a*10) ); i++;
    }

    public static void main(String[] args)
    {
        Program10 p10 = new Program10();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        p10.a = sc.nextInt();

        p10.table();
    }
}
