package Programs.Chapter_12;

public class Ch12_Assignment_2
{
    public static void main(String []args)
    {
        // Q. Swap two numbers without using any third variable

        int a = 5;
        int b = 6;

        System.out.println("Before Swapping : ("+ a +","+ b +")");

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping : ("+ a +","+ b +")");
    }
}