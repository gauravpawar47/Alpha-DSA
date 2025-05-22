package Programs.Chapter_18;
import java.util.ArrayList;

public class Ch18_03_Size
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 5; i++)
        {
            list.add(i);
        }

        System.out.println("Size of List : "+ list.size());
    }
}