public class _13_Max_Subarray_Sum_Brute_Force
{
    public static int bruteForce(int[] arr)
    {
        int maxSum = Integer.MIN_VALUE;
        int currSum;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                currSum = 0;
                for(int k = i; k <= j; k++)
                {
                    currSum += arr[k];
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, -2, 6, -1, 3};

        System.out.println("Maximum Subarray Sum : "+ bruteForce(arr));
    }
}