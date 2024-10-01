public class _11_14_Get_Set_Clear_Update
{
    public static int getBit(int n, int i)
    {
        int bitMask = 1 << i;
        if((n & bitMask) == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public static int setBit(int n, int i)
    {
        return n | 1 << i;
    }

    public static int clearBit(int n, int i)
    {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateBit(int n, int i, int newBit)
    {
        n = clearBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args)
    {
        int n = 10;
        int i = 1;

        System.out.println("Get "+ i +"th Bit : "+ getBit(n, i));
        System.out.println("Set "+ 2 +"nd Bit : "+ setBit(n, 2));
        System.out.println("Clear "+ i +"st Bit : "+ clearBit(n, i));
        System.out.println("Update "+ i +"st Bit : "+ updateBit(n, 2, 1));
    }
}