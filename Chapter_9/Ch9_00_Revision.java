package Programs.Chapter_9;
import java.util.Arrays;
import java.util.Collections;

public class Ch9_00_Revision
{
    public static void _0_Traversal(int arr[], boolean flag)
    {
        String status = flag ? "After " : "Before";

        System.out.print("Array Elements "+ status +" Sorting : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void _0_Traversal(Integer arr[], boolean flag)
    {
        String status = flag ? "After " : "Before";

        System.out.print("Array Elements "+ status +" Sorting : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void _2_BubbleSort(int arr[])
    {
        int swap = 0;

        for(int i = 0; i < arr.length - 1; i++)
        {
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

    public static void _3_SelectionSort(int arr[])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minPos = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[minPos] > arr[j])
                    minPos = j;
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            System.out.print(arr[i]+ " ");
        }
    }

    public static void _4_InsertionSort(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            int current = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] > current)
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }

    public static void _6_CountSort(int arr[])
    {
        // largest in arr
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            max = Math.max(arr[i], max);
        }

        // count arr (largest + 1)
        int count[] = new int[max + 1];

        // calculate freq
        for(int i = 0; i < count.length; i++)
        {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for(int i = 0; i < count.length; i++)
        {
            while(count[i] > 0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void Q1_1_BubbleSort(int arr[])
    {
        int count = 0;

        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] < arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    count ++;
                }
            }

            if(count == 0)
                return;
        }
    }

    public static void Q1_2_SelectionSort(int arr[])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minPos = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[minPos] < arr[j])
                {
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Q1_3_InsertionSort(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            int current = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] < current)
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }

    public static void Q1_4_CountSort(int arr[])
    {
        // largest in array
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            max = Math.max(max, arr[i]);
        }

        // count array - largest + 1
        int count[] = new int[max + 1];

        // calculate frequency in count array
        for(int i = 0; i < arr.length; i++)
        {
            count[arr[i]]++;
        }

        // sorting
        int i = 0;
        for(int j = count.length - 1; j >= 0; j--)
        {
            while(count[j] > 0)
            {
                arr[i] = j;
                i++;
                count[j]--;
            }
        }
    }

    public static void main(String[] args)
    {
        // 2 - Bubble Sort
//
//        int arr[] = {5, 4, 3, 2, 1};
//
//        _0_Traversal(arr, false);
//        _2_BubbleSort(arr);
//        _0_Traversal(arr, true);

        // 3 - Selection Sort

//        int arr[] = {5, 4, 3, 2, 1};
//
//        _0_Traversal(arr, false);
//        _3_SelectionSort(arr);
//        _0_Traversal(arr, true);

        // 4 -  Insertion Sort

//        int arr[] = {5, 4, 3, 2, 1};
//
//        _0_Traversal(arr, false);
//        _4_InsertionSort(arr);
//        _0_Traversal(arr, true);

        // 5 - Inbuilt Sort

//        int arr1[] = {1, 5, 4, 2, 3};
//        Integer arr2[] = {1, 5, 4, 2, 3};
//
//        System.out.println("Ascending Order Sorting\n");
//        _0_Traversal(arr1, false);
//
//        System.out.println();
//        Arrays.sort(arr1, 0, 3); // Sorts Within Specified Range
//        _0_Traversal(arr1, true);
//
//        Arrays.sort(arr1); // Sorts Entire Array
//        _0_Traversal(arr1, true);
//
//        System.out.println("\nDescending Order Sorting\n");
//        _0_Traversal(arr2, false);
//
//        System.out.println();
//        Arrays.sort(arr2, 0, 3, Collections.<Integer>reverseOrder()); // Sorts Within Specified Range
//        _0_Traversal(arr2, true);
//
//        Arrays.sort(arr2, Collections.reverseOrder()); // Sorts Entire Array
//        _0_Traversal(arr2, true);

        // 6 - Counting Sort

//        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
//
//        _0_Traversal(arr, false);
//        _6_CountSort(arr);
//        _0_Traversal(arr, true);

        // Assignment Q1 - Use the following sorting algorithms to sort a array in descending order

        // a. Bubble Sort
        // b. Selection Sort
        // c. Insertion Sort
        // d. Counting Sort

//        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

//        System.out.println("Bubble Sort\n");
//
//        _0_Traversal(arr, false);
//        Q1_1_BubbleSort(arr);
//        _0_Traversal(arr, true);

//        System.out.println("Selection Sort\n");
//
//        _0_Traversal(arr, false);
//        Q1_2_SelectionSort(arr);
//        _0_Traversal(arr, true);

//        System.out.println("Insertion Sort\n");
//
//        _0_Traversal(arr, false);
//        Q1_3_InsertionSort(arr);
//        _0_Traversal(arr, true);

//        System.out.println("Count Sort\n");
//
//        _0_Traversal(arr, false);
//        Q1_4_CountSort(arr);
//        _0_Traversal(arr, true);
    }
}