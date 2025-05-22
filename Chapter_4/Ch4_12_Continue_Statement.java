package Programs.Chapter_4;

public class Ch4_12_Continue_Statement
{
    public static void main(String []args)
    {
        for(int i = 1; i <= 5; i++)
        {
            if(i == 3)
                continue;

            System.out.print(i +" ");
        }
    }
}