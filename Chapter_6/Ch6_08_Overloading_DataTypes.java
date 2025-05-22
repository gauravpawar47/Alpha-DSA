package Programs.Chapter_6;

public class Ch6_08_Overloading_DataTypes
{
    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static float sum(float a, float b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        System.out.println("The sum of 5 and 66 : "+ sum(5, 66));
        System.out.println("The Sum of 5.55 and 6.956 : "+ sum(5.55f, 6.956f));
    }
}