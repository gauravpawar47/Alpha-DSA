public class _15_Prime_Number
{
    public static void main(String[] args)
    {
        int n = 7;

        for(int i = 2; i < Math.sqrt(n); i++)
        {
            if(n % i != 0)
            {
                System.out.println("Prime Number !");
                return;
            }
        }    
        System.out.println("Not Prime Number !");
    }
}