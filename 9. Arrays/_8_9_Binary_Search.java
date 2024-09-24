public class _8_9_Binary_Search
{
    public static int binarySearch(int[] arr, int key)
    {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] > key)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        System.out.println(key +" Present At Index : "+ binarySearch(arr, key));
    }
}