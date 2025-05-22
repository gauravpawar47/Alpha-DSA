package Programs.Chapter_14;

public class Ch14_05_Fibonacci
{
    public static int fibonacci(int n)
    {
        if(n == 1 || n == 0)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args)
    {
        int n = 5;

        System.out.println("Fibonacci of "+ n +" is : "+ fibonacci(n));
    }
}