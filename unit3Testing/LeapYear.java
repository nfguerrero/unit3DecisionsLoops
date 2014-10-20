import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Year: ");
        Double year = scan.nextDouble();
        
        if (((year%4)==0.0)&&((year%100)!=0.0)||((year%400)==0.0))
        {
            System.out.print("That year is a leap year!");
        }
        else
        {
            System.out.print("That year is not a leap year");
        }
    }
}
