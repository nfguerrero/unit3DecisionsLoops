import java.util.Scanner;

public class FactorPrinter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number to Factor: ");
        int num = scan.nextInt();
        
        FactorGenerator gen = new FactorGenerator(num);
        
        while (gen.hasMoreFactors())
        {
            System.out.println(gen.nextFactor());
            
        }
        
    }

}
