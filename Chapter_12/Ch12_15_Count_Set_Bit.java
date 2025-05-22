package Programs.Chapter_12;

public class Ch12_15_Count_Set_Bit
{
    public static int setBits(int n)
    {
        int count = 0;
        while(n > 0)
        {
            if((n & 1) != 0)
                count++;
            n = n >> 1;
        }

        return count;
    }

    public static void main(String []args)
    {
        int n = 15;

        System.out.println("Set Bits : "+ setBits(n));
    }
}