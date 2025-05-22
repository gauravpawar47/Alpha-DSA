package Programs.Chapter_18;
import java.util.ArrayList;

public class Ch18_05_Maximum
{
    public static void main(String[] args)
    {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(int i = 0; i < list.size() - 1; i++)
        {
            if(max < list.get(i))
            {
                max = list.get(i);
            }
        }

        System.out.println("Maximum : "+ max);
    }
}