import java.util.Scanner;

public class Epsilon
{
    public static void main(String[] args)
    {
        final double EPSILON = 1e-14;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Floating-point Number: ");
        double num = scan.nextDouble();
        
        String magnitude = "";
        
        if (Math.abs(num) < 1.0)
        {
            magnitude = "small";
        }
        if (Math.abs(num) > 1000000.0)
        {
            magnitude = "large";
        }
        
        if (Math.abs(num-0) < EPSILON)
        {
            System.out.println("It's a zero.");
        }
        else if (num > 0)
        {
            System.out.println("It's a " + magnitude + " positive number.");
        }
        else
        {
            System.out.println("It's a " + magnitude + " negative number.");
        }
    }
}