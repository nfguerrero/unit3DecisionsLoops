import java.util.Scanner;

public class FindMax
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of numbers(type 'q' to quit)");
        
        double maxValue = scan.nextDouble();
        
        while (scan.hasNextDouble())
        {
            double value = scan.nextDouble();
            if (value > maxValue)
            {
                maxValue = value;
            }
        }
        
        System.out.println("Maximum value: " + maxValue);
    }
}