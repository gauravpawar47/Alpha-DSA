public class _6_Largest_Of_Three
{
    public static void main(String[] args)
    {
        int a = 57;
        int b = 1111;
        int c = 70;

        if(a > b)
        {
            if(a > c)
            {
                System.out.println("A is Greatest");
            }
            else if(c > b)
            {
                System.out.println("C is Greatest");
            }
        }    
        else 
        {
            if(b > c)
            {
                System.out.println("B is Greatest");
            }
            else
            {
                System.out.println("C is Greatest");
            }
        }
    }
}