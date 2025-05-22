package Programs.Chapter_40;

public class Ch40_4_Longest_Common_Subsequence_Memoization
{
    public static int lcsMemoization(String s1, String s2, int n, int m, int[][] dp)
    {
        if(n == 0 || m == 0)
        {
            return 0;
        }
        if(dp[n][m] != -1)
        {
            return dp[n][m];
        }

        if(s1.charAt(n - 1) == s2.charAt(m - 1))
        {
            return dp[n][m] = lcsMemoization(s1, s2, n - 1, m - 1, dp) + 1;
        }
        else
        {
            return dp[n][m] = Math.max(lcsMemoization(s1, s2, n - 1, m, dp), lcsMemoization(s1, s2, n, m - 1, dp));
        }
    }

    public static void main(String[] args)
    {
        String s1 = "abcde";
        String s2 = "ace";
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for(int i = 0; i < dp.length; i++)
        {
            for(int j = 0; j < dp[i].length; j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println("Longest Common Subsequence : "+ lcsMemoization(s1, s2, s1.length(), s2.length(), dp));
    }
}