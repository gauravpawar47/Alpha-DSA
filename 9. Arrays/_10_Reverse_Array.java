public class _10_Reverse_Array
{
    public static int[] reverse(int[] arr)
    {
        for(int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static void printArray(int[] arr)
    {
        System.out.print("Array : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        
        printArray(arr);
        reverse(arr);
        printArray(arr);
    }
}