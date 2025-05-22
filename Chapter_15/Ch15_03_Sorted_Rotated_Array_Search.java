package Programs.Chapter_15;

public class Ch15_03_Sorted_Rotated_Array_Search
{
    public static int search(int arr[], int key, int si, int ei)
    {
        if(si > ei)
            return -1;
        int mid = si + (ei - si) / 2;

        // search at mid
        if(arr[mid] == key)
            return mid;

        // search on L1
        if(arr[si] <= arr[mid])
        {
            // left of L1
            if(arr[si] <= key && key <= arr[mid])
                return search(arr, key, si, mid - 1);

            // right of L1
            else
                return search(arr, key, mid + 1, ei);
        }

        // search on L2
        else
        {
            // right of L2
            if(arr[mid] <= key && key <= arr[ei])
                return search(arr, key, mid + 1, ei);

            // left of L2
            else
                return search(arr, key, si, mid - 1);
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int key = 0;

        System.out.println("Element Found At : "+ search(arr, key, 0, arr.length - 1));
    }
}