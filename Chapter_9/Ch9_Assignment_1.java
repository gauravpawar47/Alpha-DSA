package Programs.Chapter_9;

public class Ch9_Assignment_1
{
    public static void bubbleSort(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            int max = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[max] < arr[j])
                    max = j;
            }

            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            int current = arr[i];
            int previous = i - 1;

            while(previous >= 0 && arr[previous] < current)
            {
                arr[previous + 1] = arr[previous];
                previous--;
            }

            arr[previous + 1] = current;
        }
    }

    public static void countingSort(int arr[])
    {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            max = Math.max(arr[i], max);
        }

        int count[] = new int[max + 1];
        for(int i = 0; i < arr.length; i ++)
        {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for(int i = count.length - 1; i >= 0; i--)
        {
            while(count[i] > 0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void traversal(int arr[], String order)
    {
        System.out.print(order +" : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Q. Use the following sorting algorithms to sort an array in descending order
        // 1. Bubble Sort
        // 2. Selection Sort
        // 3. Insertion Sort
        // 4. Counting Sort

        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        traversal(arr, "Before Sorting");
        bubbleSort(arr);
        traversal(arr, "Bubble Sort");
        selectionSort(arr);
        traversal(arr, "Selection Sort");
        insertionSort(arr);
        traversal(arr, "Insertion Sort");
        countingSort(arr);
        traversal(arr, "Counting Sort");
    }
}