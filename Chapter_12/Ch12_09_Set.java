package Programs.Chapter_12;

public class Ch12_09_Set
{
    public static int setIthBit(int n, int i)
    {
        int bitMask = 1 << i;

        return n | bitMask;
    }

    public static void main(String []args)
    {
        int n = 7;
        int i = 2;

        System.out.println("Number : "+ setIthBit(n , i));
    }
}