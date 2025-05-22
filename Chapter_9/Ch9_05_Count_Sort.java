package Programs.Chapter_9;

public class Ch9_05_Count_Sort
{
    public static void countSort(int arr[])
    {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            max = Math.max(arr[i], max);
        }

        int count[] = new int[max + 1];
        for(int i = 0; i < arr.length; i++)
        {
            count[arr[i]]++;
        }

        //sorting
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
        int arr[] = {5, 4, 3, 3, 1};

        traversal(arr);
        countSort(arr);
        traversal(arr);
    }
}