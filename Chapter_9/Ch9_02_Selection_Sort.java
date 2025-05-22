package Programs.Chapter_9;

public class Ch9_02_Selection_Sort
{
    public static void selectionSort(int arr[])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
        int arr[] = {1, 5, 2, 4, 3};

        traversal(arr);
        selectionSort(arr);
        traversal(arr);
    }
}