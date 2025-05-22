package Programs.Chapter_8;

public class Ch8_08_Pairs_Array
{
    public static void pairsArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = (i + 1); j < arr.length; j++)
            {
                System.out.print("("+ arr[i] +","+ arr[j] +") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {2, 4, 6, 8, 10};
        int pairs = arr.length;

        System.out.println("Total Number of Pairs : "+ (pairs * (pairs - 1) / 2) +"\n");
        pairsArray(arr);
    }
}