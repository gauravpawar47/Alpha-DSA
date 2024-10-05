public class _4_5_Quick_Sort
{
    public static void quickSort(int[] arr, int si, int ei)
    {
        // Base-Case
        if(si >= ei)
        {
            return;
        }

        // Kaam
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei)
    {
        int pivot = arr[ei];
        int i = si - 1;

        for(int j = si; j < ei; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void printArray(int[] arr)
    {
        System.out.print("Array Elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {6, 3, 9, 8, 2, 5};

        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}