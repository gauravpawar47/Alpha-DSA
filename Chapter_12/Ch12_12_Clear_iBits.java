package Programs.Chapter_12;

public class Ch12_12_Clear_iBits
{
    public static int clearIBits(int n, int i)
    {
        int bitMask = ~(0) << i;
        return n & bitMask;
    }

    public static void main(String []args)
    {
        int n = 15;
        int i = 2;
        System.out.println("Cleared Number : "+ clearIBits(n, i));
    }
}