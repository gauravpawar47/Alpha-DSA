package Programs.Chapter_42;

public class Ch42_3_Catalan_Number_Tabulation
{
    public static int catTabulation(int n)
    {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args)
    {
        System.out.println("Catalan of "+ 4 +": "+ catTabulation(4));
    }
}