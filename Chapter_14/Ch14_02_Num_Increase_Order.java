package Programs.Chapter_14;

public class Ch14_02_Num_Increase_Order
{
    public static void printIncreasing(int n)
    {
        if(n == 1)
        {
            System.out.print(1 +" ");
            return;
        }

        printIncreasing(n - 1);
        System.out.print(n +" ");
    }

    public static void main(String []args)
    {
        int n = 5;
        printIncreasing(n);
    }
}