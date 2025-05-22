package Programs.Chapter_14;

public class Ch14_08_Last_Occurrence
{
    public static int lastOccurrence(int arr[], int i, int key)
    {
        if(i == -1)
            return -1;

        if(arr[i] == key)
            return i;

        return lastOccurrence(arr, i - 1, key);
    }

    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40, 50};
        int i = arr.length - 1;
        int key = 10;

        System.out.println(key +" Found At : "+ lastOccurrence(arr, i, key));
    }
}