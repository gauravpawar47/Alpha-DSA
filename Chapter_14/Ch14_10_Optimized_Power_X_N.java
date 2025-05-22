package Programs.Chapter_14;

public class Ch14_10_Optimized_Power_X_N
{
    public static int optimizedPower(int x, int n)
    {
        if(n == 0)
            return  1;

        int halfPower = optimizedPower(x, n / 2);

        if(n % 2 == 0)
            return halfPower * halfPower;
        else
            return x * halfPower * halfPower;
    }

    public static void main(String[] args)
    {
        int x = 2;
        int n = 5;

        System.out.println(x +" to Power of "+ n + " : "+ optimizedPower(x, n));
    }
}