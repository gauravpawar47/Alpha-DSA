public class _11_X_Power_N
{
    public static int power(int x, int n)
    {
        // Base-Case
        if(n == 1)
        {
            return x;
        }

        // Kaam
        return x * power(x, n - 1);
    }

    public static void main(String[] args)
    {
        int x = 2;
        int n = 5;

        System.out.println(x +" to Power "+ n +" is : "+ power(x, n));
    }
}