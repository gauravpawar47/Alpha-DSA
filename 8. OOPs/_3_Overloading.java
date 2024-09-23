class Maths
{
    public int sum(int a, int b)
    {
        return a + b;
    }

    public int sum(int a, int b, int c)
    {
        return a + b + c;
    }
}

public class _3_Overloading
{
    public static void main(String[] args)
    {
        Maths ms = new Maths();

        System.out.println("3 + 4 : "+ ms.sum(3, 4));
        System.out.println("3 + 4 + 8: "+ ms.sum(3, 4, 8));
    }
}