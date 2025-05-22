package Programs.Chapter_12;

public class Ch12_Assignment_3
{
    public static void main(String []args)
    {
        // Q. Add 1 to an integer using Bit Manipulation

        int a = 7;
        int b = ~a;
        int c = -b;
        System.out.println(a +", "+ b +", "+ c);
    }
}