public class _14_Max_Subarray_Sum_Prefix_Sum
{
    public static int prefixSum(int[] arr)
    {
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++)
        {   
            currSum = 0;
            for(int j = i; j < arr.length; j++)
            {
                currSum = i == 0 ? prefix[j] :  prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, -2, 6, -1, 3};

        System.out.println("Maximum Subarray Sum : "+ prefixSum(arr));
    }
}