public class _16_Clear_Range_Bits
{
    public static int clearRangeBits(int n, int i, int j)
    {
        int a = ~(0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args)
    {
        int n = 10;
        int i = 2;
        int j = 4;

        System.out.println("Before Clerning Bits : "+ n);
        System.out.println("After  Clerning Bits : "+ clearRangeBits(n, i, j));
    }
}