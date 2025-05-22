package Programs.Chapter_38;
import java.util.Arrays;

public class Ch38_4_Climbing_Stairs_Memoization
{
    public static int countMemoization(int n, int[] dp)
    {
        if(n == 0)
        {
            return 1;
        }

        if(n < 0)
        {
            return 0;
        }

        if(dp[n] != -1)
        {
            return dp[n];
        }

        dp[n] = countMemoization(n - 1, dp) + countMemoization(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args)
    {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Number Of Ways to Climb "+ n +" Stairs : "+ countMemoization(n, dp));
    }
}