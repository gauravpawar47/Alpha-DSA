public class _10_Last_Occurrence
{
    public static int lastOccurrence(int[] arr, int i, int key)
    {
        // Base-Case
        if(i == -1)
        {
            return -1;
        }

        // Kaam
        if(arr[i] == key)
        {
            return i;
        }

        return lastOccurrence(arr, i - 1, key);
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int i = arr.length - 1;
        int key = 1;
        
        System.out.println("Last Occurrence of "+ key +" is at Index : "+ lastOccurrence(arr, i, key));
    }
}