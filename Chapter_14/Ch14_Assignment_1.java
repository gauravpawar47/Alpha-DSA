package Programs.Chapter_14;

public class Ch14_Assignment_1
{
    public static void countOccurrence(int arr[], int i, int key)
    {
        if(i == arr.length)
            return;

        if(arr[i] == key)
            System.out.print(i + " ");

        countOccurrence(arr, i + 1, key);
    }

    public static void main(String[] args)
    {
        // Q. For a given integer array of size N. You have to find all the occurrences (indices) of a given element (key) and print them. Use a recursive function to solve a problem

        int arr[] = {1, 2, 1, 4, 1};

        countOccurrence(arr, 0, 1);
    }
}