package Programs.Chapter_18;
import java.util.ArrayList;

public class Ch18_Assignment_1
{
    public static boolean isMonotonic(ArrayList<Integer> list)
    {
        boolean increment = true;
        boolean decrement = true;
        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) > list.get(i + 1))
                increment = false;
            if(list.get(i) < list.get(i + 1))
                decrement = false;
        }

        return increment || decrement;
    }

    public static void main(String[] args)
    {
        // Q. Monotonic ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println("Status : "+ isMonotonic(list));
    }
}