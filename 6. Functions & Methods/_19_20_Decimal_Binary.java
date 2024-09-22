public class _19_20_Decimal_Binary
{
    public static int decBin(int dec)
    {
        int bin = 0;
        int pow = 0;

        while(dec > 0)
        {
            int lastDigit = dec % 2;
            bin = bin + (lastDigit * (int) Math.pow(10, pow));
            dec /= 2;
            pow++;
        }
 
        return bin;
    }

    public static void main(String[] args)
    {
        int dec = 11;
        System.out.println("Binary Of "+ dec +" is : "+ decBin(dec));
    }
}