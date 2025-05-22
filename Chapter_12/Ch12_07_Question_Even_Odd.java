package Programs.Chapter_12;

public class Ch12_07_Question_Even_Odd
{
    public static boolean isEvenOdd(int n)
    {
        int bitMask = 1;

        if((n & bitMask) == 0) // even
            return true;
        else // false
            return false;
    }

    public static void main(String []args)
    {
        int n = 5;

        String result = isEvenOdd(n) ? "Even" : "Odd";
        System.out.println("Result : "+ result);
    }
}