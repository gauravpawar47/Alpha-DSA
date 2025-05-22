package Programs.Chapter_40;

public class Ch40_1_Coin_Change_Live
{
    public static int coinChange(int[] coins, int amount)
    {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];

        for(int i = 0; i < n + 1; i++) // i -> coins
        {
            dp[i][0] = 1;
        }

        for(int j = 1; j < amount + 1; j++) // j -> amount / change
        {
            dp[0][j] = 0;
        }

        for(int i = 1; i < n + 1; i++)
        {
            for(int j = 1; j < amount + 1; j++)
            {
                if(coins[i - 1] <= j)
                {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                }
                else
                {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][amount];
    }
    
    public static void main(String[] args)
    {
        int[] coins = {2, 5, 3, 6};
        int sum = 10;

        System.out.println("Total Ways : "+ coinChange(coins, sum));
    }
}