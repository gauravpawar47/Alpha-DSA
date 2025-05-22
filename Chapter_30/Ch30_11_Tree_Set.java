package Programs.Chapter_30;
import java.util.Iterator;
import java.util.TreeSet;

public class Ch30_11_Tree_Set
{
    public static void main(String[] args)
    {
        TreeSet<String> cities = new TreeSet<>();

        cities.add("Nashik");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Chennai");

        System.out.print("Cities : ");
        Iterator it = cities.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next() +" ");
        }
    }
}