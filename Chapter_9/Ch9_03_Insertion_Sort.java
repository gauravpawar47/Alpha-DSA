package Programs.Chapter_9;

public class Ch9_03_Insertion_Sort
{
    public static void insertionSort(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            int currnet = arr[i];
            int previous = i - 1;

            // Finding out the correct position to insert
            while(previous >= 0 && arr[previous] > currnet)
            {
                arr[previous + 1] = arr[previous];
                previous--;
            }

            // Insertion
            arr[previous + 1] = currnet;
        }
    }

    public static void traversal(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String []args)
    {
        int arr[] = {1, 4, 2, 5, 3};

        traversal(arr);
        insertionSort(arr);
        traversal(arr);
    }
}