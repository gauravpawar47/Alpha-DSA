package Programs.Chapter_12;

public class Ch12_11_Update
{
    public static int updateIthBit(int n, int i, int bit)
    {
        int inverse = ~(1 << i);
        n = n & inverse;
        int bitMask = bit << i;
        return n | bitMask;
    }

    public static void main(String []args)
    {
        int n = 10;
        int i = 2;
        int bit = 1;

        System.out.println("Updated Bit : "+ updateIthBit(n, i, bit));
    }
}