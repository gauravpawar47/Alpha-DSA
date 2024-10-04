public class _8_Check_Array_Sorted
{
    public static boolean isSorted(int[] arr, int i)
    {
        // Base-Case
        if(i == arr.length - 1)
        {
            return true;
        }

        // Kaam
        if(arr[i] > arr[i + 1])
        {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int i = 0;

        System.out.println("Array Sorted ? : "+ isSorted(arr, i));
    }
}