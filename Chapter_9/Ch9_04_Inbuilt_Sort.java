package Programs.Chapter_9;
import java.util.Arrays;
import java.util.Collections;

public class Ch9_04_Inbuilt_Sort
{
    public static void traversal(Integer arr[], String order)
    {
        System.out.print(order +" : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String []args)
    {
        Integer arr[] = {1, 5, 2, 4, 3};

        traversal(arr, "Before Sorting");
        Arrays.sort(arr);
        traversal(arr, "Ascending Order");
        Arrays.sort(arr, Collections.reverseOrder());
        traversal(arr, "Descending Order");
    }
}