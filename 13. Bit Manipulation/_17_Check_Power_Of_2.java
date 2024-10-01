public class _17_Check_Power_Of_2
{
    public static boolean isPower(int n)
    {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args)
    {
        int n = 5;

        System.out.println("Is "+ n +" Power of 2 : "+ isPower(n));
    }
}