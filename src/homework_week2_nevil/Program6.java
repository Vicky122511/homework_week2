package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */
public class Program6
{
    int r;

    public static void main(String[] args)
    {
        Program6 p6 = new Program6();
        p6.radius();
    }

    public void radius()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius value = ");
        r= sc.nextInt();
        //Using PI default value 3.14
        System.out.println("Area = "+ (3.14*r*r));
    }
}
