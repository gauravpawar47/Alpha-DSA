public class _6_Sum_N_Natural
{
    public static int sum(int n)
    {
        // Base-Case
        if(n == 0)
        {
            return 0;
        }
        
        // Kaam
        return n + sum(n - 1);
    }

    public static void main(String[] args)
    {
        int n = 5;
        System.out.println("Sum of "+ 5 +" Natural Numbers : "+ sum(n));
    }
}