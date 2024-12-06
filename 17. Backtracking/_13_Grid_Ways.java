public class _13_Grid_Ways
{
    public static int gridWays(int i, int j, int n , int m)
    {
        // Step 1 : Base-Case
        if(i == n - 1 && j == m - 1)
        {
            return 1;
        }
        else if(i == n || j == m)
        {
            return 0;
        }

        // Step 2 & 3: Kaam & Inner Function Call
        return gridWays(i + 1, j, n, m) + gridWays(i, j + 1, n, m);
    }

    public static void main(String[] args)
    {
        int n = 3;
        int m = 4;

        System.out.println("Total Ways For "+ n +" X "+ m +" Matrix : "+ gridWays(0, 0, n, m));
    }
}