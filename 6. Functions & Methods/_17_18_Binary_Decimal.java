public class _17_18_Binary_Decimal
{
    public static int binDec(int bin)
    {
        int dec = 0;
        int pow = 0;

        while(bin > 0)
        {
            int lastDigit = bin % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            bin /= 10;
            pow++;
        }
 
        return dec;
    }

    public static void main(String[] args)
    {
        int bin = 1011;
        System.out.println("Decimal Of "+ bin +" is : "+ binDec(bin));
    }
}