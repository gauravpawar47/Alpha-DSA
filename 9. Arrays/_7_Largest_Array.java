public class _7_Largest_Array
{
    public static int largest(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 10, 11, 101, 1, 90};
        System.out.println("Maximum : "+ largest(arr));
    }
}