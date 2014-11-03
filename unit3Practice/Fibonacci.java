import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci number: ");
        int fnum = scan.nextInt();
        
        int fold1 = 1;
        int fold2 = 1;
        int fnew = 1;
        
        for (int count = 0; count < fnum; count++)
        {
            fold2 = fold1;
            fold1 = fnew;
            fnew = fold1 + fold2;            
        }
        
        System.out.print("Your Fibonacci number: " + fold2);
    }
}
