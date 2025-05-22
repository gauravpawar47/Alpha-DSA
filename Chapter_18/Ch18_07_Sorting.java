package Programs.Chapter_18;
import java.util.ArrayList;
import java.util.Collections;

public class Ch18_07_Sorting
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(15);
        list.add(5);
        list.add(100);

        System.out.println("List : "+ list);

        Collections.sort(list);
        System.out.println("List : "+ list);

        Collections.sort(list, Collections.<Integer>reverseOrder());
        System.out.println("List : "+ list);
    }
}