package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14
{
    float width, height;

    public void area()
    {
        System.out.println("Area is : %.1f * %.1f %.2f\n"+ (width * height));
    }
    public void perimeter()
    {
        System.out.println("Perimeter is "+ (2*(width + height)));
    }

    public static void main(String[] args)
    {
        Program14 p14 = new Program14();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width : ");
        p14.width=sc.nextFloat();

        System.out.println("Enter Height : ");
        p14.height=sc.nextFloat();

        p14.area();
        p14.perimeter();

    }
}
