package Programs.Chapter_2;

public class Ch2_Assignment_3
{
    public static void main(String []args)
    {
        // Q. What will be the output of the following program

        int x, y, z;
        x  = y = z = 2;
        x += y;
        System.out.println(x);
        y -= z;
        System.out.println(y);
        z /= (x + y);
        System.out.println(z);

        System.out.println("\n"+ x +" "+ y +" "+ z);

        // --> 4 0 2
    }
}