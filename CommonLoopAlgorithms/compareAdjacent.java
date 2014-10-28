import java.util.Scanner;

public class compareAdjacent
{
    /**
     * Detects adjacent numbers that are equal in the specified series of numbers
     */
    public static void main(String[] args)
    {
        final double EPSILON = 1e-7;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'q' to quit)");
        
        double preValue = scan.nextDouble();
        
        while (scan.hasNextDouble())
        {
            double value = scan.nextDouble();
            if(Math.abs(value - preValue) < EPSILON)
            {
                System.out.println("Duplicate number!");
            }
            preValue = value;
        }
    }
}