package Programs.Chapter_12;

public class Ch12_13_Clear_Range_Bits
{
    public static int clearRangeBits(int n, int i, int j)
    {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;

        return n & bitMask;
    }

    public static void main(String []args)
    {
        int n = 25;
        int i = 1;
        int j = 3;

        System.out.println("Cleared Number : "+ clearRangeBits(n, i, j));
    }
}