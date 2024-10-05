public class _7_8_Search_Rotated_Sorted
{
    public static int search(int[] arr, int target, int si, int ei)
    {
        // Base-Case
        if(si > ei)
        {
            return -1;
        }

        // Kaam
        int mid = si + (ei - si) / 2;

        // Case 0 : Middle
        if(arr[mid] == target)
        {
            return mid;
        }

        // Case 1 : Target on L1
        if(arr[si] <= arr[mid])
        {
            // Case 2 : Left of L1
            if(arr[si] <= target && target <= arr[mid])
            {
                return search(arr, target, si, mid - 1);
            }

            // Case 3 : Right of L1
            else
            {
                return search(arr, target, mid + 1, ei);
            }
        }

        // Case 4 : Target on L2
        else
        {
            // Case 5 : Right of L2
            if(arr[mid] <= target && target <= arr[ei])
            {
                return search(arr, target, mid + 1, ei);
            }

            // Case 6 : Left of L2
            else
            {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println("Pivot Index is : "+ search(arr, target, 0, arr.length - 1));
    }
}