public class _15_Clear_Last_i_Bits
{
    public static int clearBits(int n, int i)
    {
        int bitMask = ~(0) << i;
        return n & bitMask;
    }

    public static void main(String[] args)
    {
        int n = 15;
        int i = 2;

        System.out.println("Before Clearing last "+ i +" Bits : "+ n);
        System.out.println("After  Clearing last "+ i +" Bits : "+ clearBits(n, i));
    }
}