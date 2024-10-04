public class _13_14_Tiling_Problem
{
    public static int tiling(int n)
    {
        // Base-Case
        if(n == 0 || n == 1)
        {
            return 1;
        }

        // Kaam
        return tiling(n - 1) + tiling(n - 2);
    }

    public static void main(String[] args)
    {
        int n = 4;
        System.out.println("Total Ways : "+ tiling(n));
    }
}