package Programs.Chapter_38;

public class Ch38_1_Fibonacci_Memoization
{
    public static int fibMemoization(int n, int[] dp)
    {
        if(n == 1 || n == 0)
        {
            return n;
        }
        if(dp[n] != 0)
        {
            return dp[n];
        }
        dp[n] = fibMemoization(n - 1, dp) + fibMemoization(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args)
    {
        int n = 6;
        int[] dp = new int[n + 1];
        System.out.println("Fibonacci of "+ n +" : "+ fibMemoization(n, dp));
    }
}