public class _2_Print_Decreasing_Order
{
    public static void printDecreasing(int n)
    {
        // Base-Case
        if(n == 1)
        {
            System.out.println(n);
            return;
        }

        // Kaam
        System.out.print(n +" ");
        printDecreasing(n - 1);
    }

    public static void main(String[] args)
    {
        int n = 10;
        printDecreasing(n);
    }
}