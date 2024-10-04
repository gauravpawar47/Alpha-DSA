public class _16_Friends_Pairing
{
    public static int friendsPairing(int n)
    {
        // Base-Case
        if(n == 1 || n == 2)
        {
            return n;
        }

        // Kaam
        return friendsPairing(n - 1) + ((n - 1) *  friendsPairing(n - 2));
    }

    public static void main(String[] args)
    {
        int n = 5;
        System.out.println("Total Pairs : "+ friendsPairing(n));
    }
}