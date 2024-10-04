public class _13_14_Tiling_Problem
{
    public static int tiling(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
        }

        return tiling(n - 1) + tiling(n - 2);
    }

    public static void main(String[] args)
    {
        int n = 4;
        System.out.println("Total Ways : "+ tiling(n));
    }
}