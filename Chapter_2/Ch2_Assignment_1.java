package Programs.Chapter_2;

public class Ch2_Assignment_1
{
    public static void main(String []args)
    {
        // Q. What will be the output of the following program

        int x = 2;
        int y = 5;

        int exp1 = (x * y / 2);
        int exp2 = (x * (y / x));

        System.out.print(exp1 +" , ");
        System.out.print(exp2);

        // --> 5 , 4
    }
}