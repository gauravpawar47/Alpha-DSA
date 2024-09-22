public class _14_15_Prime
{
    public static boolean isPrime(int n)
    {
        if(n == 1 || n == 2)
        {
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int n = 11;
        System.out.println(n +" is Prime : "+ isPrime(n));
    }
}