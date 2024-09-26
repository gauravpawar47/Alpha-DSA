import java.util.Arrays;

public class _8_In_Built
{
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
        int[] arr = {5, 4, 1, 3, 2};

        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
}