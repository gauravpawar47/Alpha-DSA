public class _12_Print_Subarray
{
    public static void subArray(int[] arr)
    {
        int ts = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                sum = 0;
                for(int k = i; k <= j; k++)
                {
                    System.out.print(arr[k]); 
                    sum += arr[k];
                }
                ts++;
                max = Math.max(max, sum);
                min = Math.min(min, sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    
        System.out.println("Total Sub Arrays : "+ ts);
        System.out.println("Total Sub Arrays Sum : "+ sum);
        System.out.println("Maximum : "+ max);
        System.out.println("Minimum : "+ min);
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 8, 10};
        subArray(arr);
    }
}