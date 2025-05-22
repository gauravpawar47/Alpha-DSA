package Programs.Chapter_41;

public class Ch41_4_String_Conversion
{
    public static int longestCommonSubsequence(String str1, String str2)
    {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static int[] insertionDeletionCount(String str1, String str2)
    {
        int lcsLength = longestCommonSubsequence(str1, str2);
        int deletions = str1.length() - lcsLength;
        int insertions = str2.length() - lcsLength;

        return new int[]{deletions, insertions};
    }

    public static void main(String[] args)
    {
        String str1 = "pear";
        String str2 = "sea";

        int[] result = insertionDeletionCount(str1, str2);
        int deletions = result[0];
        int insertions = result[1];

        System.out.println("Number of deletions: " + deletions);
        System.out.println("Number of insertions: " + insertions);
    }
}