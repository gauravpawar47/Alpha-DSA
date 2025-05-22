package Programs.Chapter_12;

public class Ch12_14_Question_Check_Power_2
{
    public static boolean isPowerOfTwo(int n)
    {
        return (n & (n-1)) == 0;
    }

    public static void main(String []args)
    {
        int n = 16;

        System.out.println("Status : "+ isPowerOfTwo(n));
    }
}