package Programs.Chapter_14;

public class Ch14_04_Sum_N_Natural_Number
{
    public static int sum(int n)
    {
        if(n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }

    public static void main(String[] args)
    {
        int n = 5;

        System.out.println("Sum of First "+ n +" Natural Number is : "+ sum(n));
    }
}