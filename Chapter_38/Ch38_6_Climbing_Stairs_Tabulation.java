package Programs.Chapter_38;

public class Ch38_6_Climbing_Stairs_Tabulation
{
    public static int countTabulation(int n)
    {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++)
        {
            if(i == 1)
            {
                dp[i] = dp[i - 1] + 0;
            }
            else
            {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args)
    {
        int n = 5;
        System.out.println("Number Of Ways to Climb "+ n +" Stairs : "+ countTabulation(n));
    }
}