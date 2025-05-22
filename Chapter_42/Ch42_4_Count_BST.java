package Programs.Chapter_42;

public class Ch42_4_Count_BST
{
    public static int countBST(int n)
    {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n + 1; i++)
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
        System.out.println("Number of BST can form from 4 Nodes : "+ countBST(4));
    }
}