public class _12_X_Power_N_Optimized
{
    public static int optimizedPower(int x, int n)
    {
        // Base-Case
        if(n == 0)
        {
            return 1;
        }

        // Kaam
        int halfPower = optimizedPower(x, n / 2);
        if(n % 2 == 0)
        {
            return halfPower * halfPower;
        }
        else
        {
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args)
    {
        int x = 2;
        int n = 5;

        System.out.println(x +" to Power "+ n +" is : "+ optimizedPower(x, n));
    }
}