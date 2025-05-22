package Programs.Chapter_15;

public class Ch15_01_Merge_Sort
{
    public static void mergeSort(int arr[], int si, int ei)
    {
        if(si >= ei)
            return;

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left partition
        mergeSort(arr, mid + 1, ei); // right partition
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei)
    {
        //  i         j
        // {6, 3, 9, 5, 2, 8}
        int temp[] = new int[ei - si + 1];
        int i = si; // right partition iterator
        int j = mid + 1; // left partition iterator
        int k = 0; // temp iterator

        // Comparison Between left Partition and Right Partition
        while(i <= mid && j <= ei)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Inserting Remaining Left Partition Elements
        while(i <= mid)
        {
            temp[k++] = arr[i++];
        }

        // Inserting Remaining Right Partition Elements
        while(j <= ei)
        {
            temp[k++] = arr[j++];
        }

        // Copying Elements from temp to arr
        for(k = 0, i = si; k < temp.length; k++, i++)
        {
            arr[i] = temp[k];
        }
    }

    public static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.print("Array Before Sorting : ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Array After Sorting  : ");
        printArray(arr);
    }
}