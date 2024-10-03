public class _5_Factorial
{
    public static int factorial(int n)
    {
        // Base-Case
        if(n == 1 || n == 0)
        {
            return 1;
        }

        // Kaam
        return n * factorial(n - 1);
    }

    public static void main(String[] args)
    {   
        int n = 5;

        System.out.println("Factorial of "+ n +" is : "+ factorial(n));
    }
}