package Programs.Chapter_8;

public class Ch8_07_Reverse_Array
{
    public static void reverse(int arr[])
    {
        int start = 0;
        int last = arr.length - 1;

        while(start < last)
        {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;

            start += 1;
            last -= 1;
        }
    }

    public static void main(String []args)
    {
        int arr[] = {10, 4, 6 , 1};

        System.out.print("Before Reversing : ");
        for(int a : arr)
        {
            System.out.print(a +" ");
        }

        System.out.print("\nAfter Reversing : ");
        reverse(arr);
        for(int a : arr)
        {
            System.out.print(a +" ");
        }
    }
}