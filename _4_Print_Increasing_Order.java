public class _4_Print_Increasing_Order
{
    public static void printIncreasing(int n)
    {
        // Base-Case
        if(n == 1)
        {
            System.out.print(n +" ");
            return;
        }

        printIncreasing(n - 1);
        System.out.print(n +" ");
    }

    public static void main(String[] args)
    {
        int n  = 5;
        printIncreasing(n);
    }
}