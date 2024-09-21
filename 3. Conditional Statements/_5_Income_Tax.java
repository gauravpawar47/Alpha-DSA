public class _5_Income_Tax
{
    public static void main(String[] args)
    {
        int income = 500000;

        if(income < 500000)    
        {
            System.out.println("No Tax");
        }
        else if (income >= 500000 && income < 1000000)
        {
            System.out.println("Tax : "+ (income) * 0.2);
        }
        else if(income >= 1000000)
        {
            System.out.println("Tax : "+ (income) * 0.3);
        }
    }
}