package Programs.Chapter_18;
import java.util.ArrayList;

public class Ch18_08_Multidimensional_ArrayList
{
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i <= 5; i++)
        {
            list1.add(i);
            list2.add(i * 2);
            list3.add(i * 3);
        }

        list.add(list1);
        list.add(list2);
        list.add(list3);

        System.out.println("List : "+ list);
    }
}