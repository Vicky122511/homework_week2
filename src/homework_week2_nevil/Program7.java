package homework_week2_nevil;

import java.util.Scanner;

/**
 *  Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */

public class Program7
{
    float f;

    public void temperature()
    {
        System.out.println("(( "+f + " - 32) * 5/9 ="+ ((f-32)*5/9) );
    }
    public static void main(String[] args)
    {
        Program7 p7 = new Program7();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature : ");
         p7.f= sc.nextFloat();

         p7.temperature();
    }

}
