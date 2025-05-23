package Programs.Chapter_29;

public class Ch29_4_Heap_Sort
{
    public static void heapify(int[] arr, int i, int n)
    {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;

        if(left < n && arr[left] > arr[max])
        {
            max = left;
        }

        if(right < n && arr[right] > arr[max])
        {
            max = right;
        }

        if(max != i)
        {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            heapify(arr, max, i);
        }
    }

    public static void heapSort(int arr[])
    {
        // Step 1 : Build Max Heap
        int n = arr.length;
        for(int i = n / 2; i >= 0; i--)
        {
            heapify(arr, i, n);
        }

        // Step 2 : Push Largest Element in End
        for(int i = n - 1; i >= 0; i--)
        {
            // Swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void print(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 4, 5, 3};

        System.out.print("Before Max Heap Sort : ");
        print(arr);

        heapSort(arr);

        System.out.print("After  Max Heap Sort : ");
        print(arr);
    }
}