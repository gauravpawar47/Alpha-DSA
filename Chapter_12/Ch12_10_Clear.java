package Programs.Chapter_12;

public class Ch12_10_Clear
{
    public static int clearIthBit(int n, int i)
    {
        int bitMask = ~(1 << i);

        return n & bitMask;
    }

    public static void main(String []args)
    {
        int n = 6;
        int i = 1;

        System.out.println("Bit : "+ clearIthBit(n , i));
    }
}