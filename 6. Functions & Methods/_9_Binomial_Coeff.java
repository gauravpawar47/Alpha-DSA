public class _9_Binomial_Coeff
{
    public static int factorial(int n)
    {   
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }
 
        return fact;
    }

    public static int binCoeff(int n, int k)
    {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args)
    {
        int n = 5;
        int k = 2;
        System.out.println("Binomial Coefficient : "+ binCoeff(n, k));
    }
}