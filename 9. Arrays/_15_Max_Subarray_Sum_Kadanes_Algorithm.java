public class _15_Max_Subarray_Sum_Kadanes_Algorithm
{
    public static int kadanesAlgo(int[] arr)
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            currSum += arr[i];
            if(currSum < 0)
            {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, -2, 6, -1, 3};

        System.out.println("Maximum Subarray Sum : "+ kadanesAlgo(arr));
    }
}