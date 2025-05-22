package Programs.Chapter_14;

public class Ch14_01_Num_Decrease_Order
{
    public static void printDecreasing(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }

        System.out.print(n +" ");
        printDecreasing(n - 1);
    }

    public static void main(String []args)
    {
        int n = 5;
        printDecreasing(n);
    }
}