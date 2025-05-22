package Programs.Chapter_8;

public class Ch8_11_Max_Sum_Prefix_Sum
{
    public static void maxSumPrefix(int arr[])
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i < prefix.length; i++)
        {
            prefix[i] = prefix[i - 1] + arr[i];
            System.out.print(prefix[i-1] +" ");
        }

        System.out.println("\n\n");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                sum = i == 0 ? prefix[j]: prefix[j] - prefix[i - 1];
                System.out.print(sum +" ");

                if(sum > max)
                    max = sum;
                if(sum < min)
                    min = sum;
            }
            System.out.println();
        }
        System.out.println("\nMaximum sum : "+ max);
        System.out.println("Minimum sum : "+ min);
    }

    public static void main(String []args)
    {
        int arr[] = {2, 4, 6, 8, 10};

        maxSumPrefix(arr);
    }
}