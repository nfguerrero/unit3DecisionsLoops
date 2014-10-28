import java.util.Scanner;

public class FindFirstMatch
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("String: ");
        String str = scan.nextLine();
        System.out.print("Find: ");
        String k = scan.nextLine();
        char key = k.charAt(0);
        
        int index = 0;
        char ch = '|';
        
        while (index < str.length())
        {
            ch = str.charAt(index);
            if(ch == key)
            {
                System.out.println("Index of first " + key + ": " + index);
                break;
            }
            index ++;
        }
    }
}