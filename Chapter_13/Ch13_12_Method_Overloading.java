package Programs.Chapter_13;

public class Ch13_12_Method_Overloading
{
    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static float sum(float a, float b)
    {
        return a + b;
    }

    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String []args)
    {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
    }
}