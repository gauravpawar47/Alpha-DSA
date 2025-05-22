package Programs.Chapter_8;

public class Ch8_10_Max_Sum_Brute_Force
{
    public static void maxSumBruteForce(int arr[])
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                sum = 0;
                for(int k = i; k <= j; k++)
                {
                    System.out.print(arr[k] +", ");
                    sum += arr[k];
                }
                System.out.println("Sum of this sub array is : " + sum);

                if(sum > max)
                    max = sum;
                if(sum < min)
                    min = sum;
            }
            System.out.println();
        }
        System.out.println("Maximum sum : "+ max);
        System.out.println("Minimum sum : "+ min);
    }

    public static void main(String []args)
    {
        int arr[] = {1, -2, 6, -1, 3};

        maxSumBruteForce(arr);
    }
}