public class PracticeSet
{
    public static void bubbleSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] < arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minPos = i;
            for(int j = i + 1; j < arr.length - 1; j++)
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

    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length - 1; i++)
        {
            int prev = i - 1;
            int curr = arr[i];

            while(prev >= 0 && arr[prev] < curr)
            {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    public  static void countSort(int[] arr)
    {
        // Count Frequency
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
        for(int i = freq.length - 1; i >= 0; i--)
        {
            while(freq[i] > 0)
            {
                arr[j] = i;
                j++;
                freq[i]--;
            }
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
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        print(arr);
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countSort(arr);
        print(arr);
    }
}