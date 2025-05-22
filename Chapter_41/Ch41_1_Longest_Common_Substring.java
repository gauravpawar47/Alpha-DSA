package Programs.Chapter_41;

public class Ch41_1_Longest_Common_Substring
{
    public static int longestCommonSubstring(String text1, String text2)
    {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m + 1];
        int result = 0;

        for(int i = 0; i < n + 1; i++)
        {
            dp[i][0] = 0;
        }

        for(int j = 0; j < m + 1; j++)
        {
            dp[0][j] = 0;
        }

        for(int i = 1; i < n + 1; i++)
        {
            for(int j = 1; j < m + 1; j++)
            {
                if(text1.charAt(i - 1) == text2.charAt(j - 1))
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                }

                else
                {
                    dp[i][j] = 0;
                }
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        String str1 = "abcde";
        String str2 = "abgce";

        System.out.println("Longest Common Substring : "+ longestCommonSubstring(str1, str2));
    }
}