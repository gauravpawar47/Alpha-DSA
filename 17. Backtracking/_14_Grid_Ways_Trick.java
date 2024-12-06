public class _14_Grid_Ways_Trick
{
    public static int gridWays(int n, int m)
    {
        return factorial((n - 1) + (m - 1)) / (factorial(n - 1) * factorial(m - 1));
    }

    public static int factorial(int n)
    {
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args)
    {
        int n = 4;
        int m = 4;

        System.out.println("Total Ways For "+ n +" X "+ m +" Matrix : "+ gridWays(n, m));
    }
}