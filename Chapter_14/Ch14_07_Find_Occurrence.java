package Programs.Chapter_14;

public class Ch14_07_Find_Occurrence
{
    public static int findOccurrence(int arr[], int i, int key)
    {
        if(i == arr.length - 1)
            return -1;

        if(arr[i] == key)
            return i;

        return findOccurrence(arr, i + 1, key);
    }

    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40, 50};
        int i = 0;
        int key = 30;

        System.out.println(key +" is Present at : "+ findOccurrence(arr, i, key));
    }
}