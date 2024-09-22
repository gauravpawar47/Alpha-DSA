public class _16_Prime_Range
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
    
    public static void primesRange(int n)
    {
        System.out.print("Primes in "+ n +" Range : ");
        for(int i = 2; i <= n; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int n = 100;
        primesRange(n);
    }
}