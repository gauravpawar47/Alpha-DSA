package Programs.Chapter_43;

public class Ch43_4_Minimum_Partitioning
{
    public static int minPartition(int[] arr)
    {
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        int W = sum / 2;
        int[][] dp = new int[n + 1][W + 1];

        for(int i = 1; i < n + 1; i++)
        {
            for(int j = 1; j < W + 1; j++)
            {
                if(arr[i - 1] <= j)
                {
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                }
                else
                {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return Math.abs(dp[n][W] - (sum - dp[n][W]));
    }

    public static void main(String[] args)
    {
        int[] nums = {1, 6, 11, 5};
        System.out.println(" Minimum Partition : "+ minPartition(nums));
    }
}