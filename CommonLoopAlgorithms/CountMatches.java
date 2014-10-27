import java.util.Scanner;

public class CountMatches
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.nextLine(); //reads entire line; not just a word
        
        int numSpaces = 0;
        
        for (int index = 0; index < str.length(); index++)
        {
            char ch = str.charAt(index);
            if (ch == ' ')
            {
                numSpaces++;
            }
        }
        
        System.out.println("Number of spaces: " + numSpaces);
    }
}