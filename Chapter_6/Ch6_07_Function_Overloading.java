package Programs.Chapter_6;

public class Ch6_07_Function_Overloading
{
    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String[] args)
    {
        System.out.println("The Sum of 5 and 6 : "+ sum(5, 6));
        System.out.println("The Sum of 5, 6, 56 : "+ sum(5, 6, 56));
    }
}