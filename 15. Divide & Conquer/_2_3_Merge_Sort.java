public class _2_3_Merge_Sort
{
    public static void mergeSort(int[] arr, int si, int ei)
    {
        // Base-Case
        if(si >= ei)
        {
            return;
        }

        // Kaam
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left
        mergeSort(arr, mid + 1, ei); // right
        merge(arr, si, mid, ei); // merge step
    }

    public static void merge(int[] arr, int si, int mid, int ei)
    {
        // Initializing Variables
        int[] merge = new int[ei - si + 1];
        int i = si; 
        int j = mid + 1;
        int k = 0;

        // Main Merge
        while(i <= mid && j <= ei)
        {
            if(arr[i] < arr[j])
            {
                merge[k] = arr[i];
                i++;
            }
            else
            {
                merge[k] = arr[j];
                j++;
            }
            k++;
        }

        // Remaining Left Elements
        while(i <= mid)
        {
            merge[k++] = arr[i++];
        }

        // Remaining Right Elements
        while(j <= ei)
        {
            merge[k++] = arr[j++];
        }

        // Moving Elements from merge to arr
        for(k = 0, i = si; k < merge.length; k++, i++)
        {
            arr[i] = merge[k];
        }
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
        int[] arr = {6, 3, 9, 5, 2, 8};

        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}