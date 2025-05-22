package Programs.Chapter_9;

public class Ch9_01_Bubble_Sort
{
    public static void bubbleSort(int arr[])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int swap = 0;
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap == 0)
                return;
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
        int arr[] = {5, 4, 3, 2, 1};

        traversal(arr);
        bubbleSort(arr);
        traversal(arr);
    }
}