package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Program9
{
    String name;
    public void upperlower()
    {
        System.out.println("Convert into Lowercase :"+ name.toLowerCase());
    }
    public static void main(String[] args)
    {
        Program9 p9 = new Program9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Sentence : ");
        p9.name = sc.nextLine();

        p9.upperlower();

    }
}
