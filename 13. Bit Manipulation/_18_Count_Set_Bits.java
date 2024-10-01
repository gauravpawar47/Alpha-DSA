public class _18_Count_Set_Bits
{
    public static int countSetBits(int n)
    {
        int count = 0;
        while(n > 0)
        {
            if((n & 1) == 1)
            {
                count++;
            }   
            n >>= 1;
        }
        
        return count;
    }

    public static void main(String[] args)
    {
        int n = 10;

        System.out.println("Total Set Bits : "+ countSetBits(n));
    }
}