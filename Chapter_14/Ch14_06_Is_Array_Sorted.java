package Programs.Chapter_14;

public class Ch14_06_Is_Array_Sorted
{
    public static boolean isSorted(int arr[], int i)
    {
        if(i == arr.length - 1)
            return true;

        if(arr[i] > arr[i + 1])
            return false;

        return isSorted(arr, i + 1);
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5};
        int i = 0;

        if(isSorted(arr, i))
            System.out.println("Array Is Sorted");
        else
            System.out.println("Array Is Not Sorted");
    }
}