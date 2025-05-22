package Programs.Chapter_17;

public class Ch17_01_Backtrack_Arrays
{
    public static void backtrackArray(int arr[], int i, int data)
    {
        // base case
        if(i == arr.length)
        {
            printArray(arr);
            return;
        }

        // recursion
        arr[i] = data;
        backtrackArray(arr, i + 1, data + 1);
        arr[i] -= 2;
    }

    public static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int arr[] = new int[5];

        backtrackArray(arr, 0, 1);
        printArray(arr);
    }
}