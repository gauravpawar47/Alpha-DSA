import java.util.Scanner;

public class _4_Print_1_N
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int i = 1;
        
        System.out.print("Enter a Value N : ");
        int n = input.nextInt();

        while(i <= n)
        {
            System.out.print(i +" ");
            i++;
        }    
        System.out.println();
    }
}