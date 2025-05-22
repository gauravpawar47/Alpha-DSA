package Programs.Chapter_39;

public class Ch39_1_0_1_Knapsack_Recursion
{
    public static int knapsackRecursion(int[] val, int[] wt, int W, int n)
    {
        if(W == 0 || n == 0)
        {
            return 0;
        }

        // Valid
        if(wt[n - 1] <= W)
        {
            // Include
            int ans1 = val[n - 1] + knapsackRecursion(val, wt, W - wt[n - 1], n - 1);
            // Exclude
            int ans2 = knapsackRecursion(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        }
        else
        {
            return knapsackRecursion(val, wt, W, n - 1);
        }
    }

    public static void main(String[] args)
    {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;

        System.out.println("Max Profit : "+ knapsackRecursion(val, wt, W, val.length));
    }
}