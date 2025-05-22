package Programs.Chapter_30;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ch30_10_Linked_Hash_Set
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Nashik");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Chennai");

        Iterator it = cities.iterator();

        System.out.print("Cities : ");
        while(it.hasNext())
        {
            System.out.print(it.next() +" ");
        }
    }
}