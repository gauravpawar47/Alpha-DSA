public class _10_Even_Odd
{
    public static void main(String[] args)
    {
        int n = 5;
        int bitMask = 1;

        if((n & 1) == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}