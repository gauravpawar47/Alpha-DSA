package Programs.Chapter_42;
import java.util.Arrays;

public class Ch42_2_Catalan_Number
{
    public static int catRecursion(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        int ans = 0;
        for(int i = 0; i <= n - 1; i++)
        {
            ans += catRecursion(i) * catRecursion(n - i - 1);
        }
        return ans;
    }

    public static int catMemoization(int n, int[] dp)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        if(dp[n - 1] != -1)
        {
            return dp[n];
        }

        int ans = 0;
        for(int i = 0; i <= n - 1; i++)
        {
            ans += catMemoization(i, dp) * catMemoization(n - 1 - i, dp);
        }
        return dp[n] = ans;
    }

    public static void main(String[] args)
    {
        int n = 4;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Catalan of "+ n +": "+ catRecursion(n));
        System.out.println("Catalan of "+ n +": "+ catMemoization(n, dp));
    }
}