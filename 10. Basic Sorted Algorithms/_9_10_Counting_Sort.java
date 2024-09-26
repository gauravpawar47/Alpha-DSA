public class _9_10_Counting_Sort
{
    public static void print(int[] arr)
    {
        System.out.print("ARRAY : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void countSort(int[] arr)
    {
        // Frequency Count
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            max = Math.max(max, arr[i]);
        }

        int[] freq = new int[max + 1];
        for(int i = 0; i < arr.length; i++)
        {
            freq[arr[i]]++;
        }

        // Append According to Frequency
        int j = 0;
        for(int i = 0; i < freq.length; i++)
        {
            while(freq[i] > 0)
            {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
    }

    public static void main(String[] args)
    {
        // int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        print(arr);
        countSort(arr);
        print(arr);
    }
}