package Programs.Chapter_38;

public class Ch38_3_Climbing_Stairs_Recursion
{
    public static int countRecursion(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(n < 0)
        {
            return 0;
        }

        return countRecursion(n - 1) + countRecursion(n - 2);
    }

    public static void main(String[] args)
    {
        int n = 5;

        System.out.println("Number Of Ways to Climb "+ n +" Stairs : "+ countRecursion(n));
    }
}