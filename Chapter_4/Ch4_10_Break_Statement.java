package Programs.Chapter_4;

public class Ch4_10_Break_Statement
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.print(i +" ");

            if(i == 3)
                break;
        }
        System.out.println("\n\nI'm out of the loop..!");
    }
}