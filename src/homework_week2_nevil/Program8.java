package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Program8
{
    float base,height;

    public void triangle()
    {
        float f= (base*height)/2;
        System.out.println("Triangle = "+ f);
    }

    public static void main(String[] args)
    {
        Program8 p8 = new Program8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Base : ");
        p8.base=sc.nextFloat();
        System.out.println("Enter value of Height : ");
        p8.height=sc.nextFloat();

        p8.triangle();

    }
}
