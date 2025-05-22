package Programs.Chapter_38;
import java.util.Arrays;

public class Ch38_5_Climbing_Stairs_Variation
{
    public static int countVariation(int n, int[] dp)
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

        dp[n] = countVariation(n - 1, dp) + countVariation(n - 2, dp) + countVariation(n - 3, dp);
        return dp[n];
    }

    public static void main(String[] args)
    {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Number Of Ways to Climb "+ n +" Stairs : "+ countVariation(n, dp));
    }
}