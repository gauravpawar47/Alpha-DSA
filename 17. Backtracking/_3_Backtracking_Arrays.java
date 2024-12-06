public class _3_Backtracking_Arrays
{
    public static void backtrack(int[] arr, int i, int data)
    {
        // Step 1 : Base-Case
        if(i == arr.length)
        {
            printArray(arr);
            return;
        }

        // Step 2 & 3 : Kaam & Inner Function Call
        arr[i] = data;
        backtrack(arr, i + 1, data + 1);
        arr[i] -= 2;
    }

    public static void printArray(int[] arr)
    {
        System.out.print("Array Elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = new int[5];
        backtrack(arr, 0, 1);
        printArray(arr);
    }
}