package Programs.Chapter_14;

public class Ch14_13_Binary_String_Problem
{
    public static void binaryString(int n, int lastPlace, String str)
    {
        if(n == 0)
        {
            System.out.println(str);
            return;
        }

        binaryString(n - 1, 0, str + "0");
        if(lastPlace == 0)
            binaryString( n - 1, 1, str + "1");
    }

    public static void main(String[] args)
    {
        int n = 3;

        binaryString(n, 0, "");
    }
}