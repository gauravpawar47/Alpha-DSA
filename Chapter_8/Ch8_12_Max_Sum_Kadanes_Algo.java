package Programs.Chapter_8;

public class Ch8_12_Max_Sum_Kadanes_Algo
{
    public static void kadanesAlgo(int arr[])
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int temp = 0, min = 0;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < 0 && arr[i - 1] > arr[i])
            {
                min = arr[i - 1];
                System.out.print(min +" ");
            }
        }

        System.out.println("\n\n\n");
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if(sum < 0)
                sum = 0;

            max = Math.max(max, sum);
            System.out.print(sum +" ");
        }

        System.out.println("\nMaximum is : "+ max);
        System.out.println("Minimum is : "+ min);
    }

    public static void main(String []args)
    {
        int arr[] = {-2, -3, -4, -1, -2, -1, -5, -3};

        kadanesAlgo(arr);
    }
}