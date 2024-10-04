public class _9_Find_Occurrence
{
    public static int findOccurrence(int[] arr, int i, int key)
    {
        // Base-Case
        if(i == arr.length)
        {
            return -1;
        }

        // Kaam
        if(arr[i] == key)
        {
            return i;
        }

        return findOccurrence(arr, i + 1, key);
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int i = 0;
        int key = 7;

        System.out.println("First Occurrence of "+ key +" is at Index : "+ findOccurrence(arr, i, key));
    }
}