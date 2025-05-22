package Programs.Chapter_12;

public class Ch12_08_Get
{
    public static int getIthBit(int n, int i)
    {
        int bitMask = 1 << i;
        
        if((n & bitMask) == 0)
            return 0;
        else
            return 1;
    }

    public static void main(String []args)
    {
        int n = 5;
        int i = 2;

        System.out.println("Bit : "+ getIthBit(n, i));
    }
}