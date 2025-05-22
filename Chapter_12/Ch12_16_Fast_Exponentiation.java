package Programs.Chapter_12;

public class Ch12_16_Fast_Exponentiation
{
    public static int fastExpo(int n, int power)
    {
        int result = 1;

        while(power > 0)
        {
            if((power & 1) != 0) // check LSB
                result *= n;
            n *= n;
            power = power >> 1;
        }

        return result;
    }

    public static void main(String []args)
    {
        int n = 3;
        int power = 3;

        System.out.println("Fast Exponentation : "+ fastExpo(n, power));
    }
}