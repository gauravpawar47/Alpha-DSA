package Programs.Chapter_8;

public class Ch8_09_Print_Subarrays
{
    public static void subArrays(int arr[])
    {
        // Homework Stuff
        int ts = 0;
        int sum = 0, sumArr[] = new int[arr.length];
        int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                sum = 0; // Homework Stuff
                for(int k = i; k <= j; k++)
                {
                    System.out.print("("+ arr[k] +") ");
                    sum += arr[k]; // Homework Stuff
                }
                // Homework Stuff
                ts += 1;
                System.out.println(" Sum of this sub array is : " + sum);
            }
            sumArr[i] = sum; // Homework Stuff
            System.out.println();
        }

        // Homework Stuff
        System.out.println("Total Subarrays : "+ ts +"\n");
        for(int i = 0; i < arr.length; i++)
        {
            if(sumArr[i] > max)
                max = sumArr[i];

            if(sumArr[i] < min)
                min = sumArr[i];
        }
        System.out.println("Maximum Sum : "+ max);
        System.out.println("Minimum Sum : "+ min);
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 5, 10};

        subArrays(arr);
    }
}