public class _7_Fibonacci_Number
{
    public static int fibonacci(int n)
    {
        // Base-Case
        if(n == 1 || n == 0)
        {
            return n;
        }

        // Kaam
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args)
    {
        int n = 5;
        System.out.println("Fibonacci of "+ n +" is : "+ fibonacci(n));
    }
}