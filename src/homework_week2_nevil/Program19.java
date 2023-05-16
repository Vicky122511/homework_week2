package homework_week2_nevil;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog
 */
public class Program19
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
