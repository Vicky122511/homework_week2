package homework_week2_nevil;

/**
 * Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Program12
{
    public  void cal()
    {
        System.out.println("Expected Output : " + ((25.5 * 3.5 - 3.5 * 3.5 )/ (40.5 - 4.5)) );
    }
    public static void main(String[] args)
    {
        Program12 p12 = new Program12();
        p12.cal();
    }
}
