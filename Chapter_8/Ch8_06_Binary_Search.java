package Programs.Chapter_8;

public class Ch8_06_Binary_Search
{
    public static int binarySearch(int numbers[], int key)
    {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end)
        {
            int mid = (start + end) / 2;

            if(numbers[mid] == key) // middle
                return mid;
            else if(numbers[mid] < key) // right half
                start = mid + 1;
            else // left half
                end = mid - 1;
        }
        return - 1;
    }

    public static void main(String []args)
    {
        int numbers[] = {2, 5, 6, 8, 10, 14, 15, 18, 100, 100};
        int key = 18;

        int index = binarySearch(numbers, key);
        System.out.println("Index  : "+ index);
    }
}