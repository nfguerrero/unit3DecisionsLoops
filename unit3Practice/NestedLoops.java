public class NestedLoops
{
    public static void main(String[] args)
    {
        int count = 1;
        
        do
        {
            int count2 = 1;
            do
            {
                System.out.println(count + " " + count2);
                count2++;
            }
            while (count2 < 5);
            count++;
        }
        while (count < 3);
    }
}