public class _17_Binary_String
{
    public static void binaryString(int n, int lp, String str)
    {
        // Base-Case
        if(n == 0)
        {
            System.out.println(str);
            return;
        }

        // Kaam
        binaryString(n - 1, 0, str +"0");
        if(lp == 0)
        {
            binaryString(n - 1, 1, str +"1");
        }
    }

    public static void main(String[] args)
    {
        int n = 3;
        binaryString(n, 0, "");
    }
}