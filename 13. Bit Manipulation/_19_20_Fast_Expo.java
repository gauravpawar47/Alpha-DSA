public class _19_20_Fast_Expo
{
    public static int fastExpo(int n, int power)
    {
        int expo = 1;
        while(power > 0)
        {
            if((power & 1) == 1)
            {
                expo *= n;
            }
            n *= n;
            power >>= 1;
        }
        return expo;
    }

    public static void main(String[] args)
    {
        int n = 2;
        int power = 10;

        System.out.println(n +" to the Power "+ power +" is : "+ fastExpo(n, power));
    }
}