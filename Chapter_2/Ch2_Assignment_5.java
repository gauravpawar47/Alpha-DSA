package Programs.Chapter_2;

public class Ch2_Assignment_5
{
    public static void main(String[] args)
    {
        // Q. What will be the output of the following program

        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);
        System.out.println(exp2);

        /* --> 20
               20
        */
    }
}