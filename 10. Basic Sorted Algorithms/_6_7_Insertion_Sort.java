public class _6_7_Insertion_Sort
{
    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length - 1; i++)
        {
            int prev = i - 1;
            int curr = arr[i];
            while(prev >= 0 && arr[prev] > curr)
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void print(int[] arr)
    {
        System.out.print("ARRAY : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 4, 1, 3, 2};

        print(arr);
        insertionSort(arr);
        print(arr);
    }
}