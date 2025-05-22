package Programs.Chapter_8;

public class Ch8_05_Largest_Array
{
    public static int findMax(int numbers[])
    {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > largest)
                largest = numbers[i];
        }
        return largest;
    }

    public static void main(String []args)
    {
        int numbers[] = {1, 5, 8, 2, 9, 3};
        int max = findMax(numbers);

        System.out.println("Maximum is : "+ max);
    }
}