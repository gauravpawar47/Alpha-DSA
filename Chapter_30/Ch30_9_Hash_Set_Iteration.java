package Programs.Chapter_30;
import java.util.HashSet;
import java.util.Iterator;

public class Ch30_9_Hash_Set_Iteration
{
    public static void main(String[] args)
    {
        HashSet<String> cities = new HashSet<>();

        cities.add("Nashik");
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Chennai");

        // Method 1 - Iterator

        Iterator it = cities.iterator();

        System.out.print("City : ");
        while(it.hasNext())
        {
            System.out.print(it.next() +" ");
        }
        
        // Method 2 - Enhanced For Loop

        System.out.print("\nCity : ");
        for(String city : cities)
        {
            System.out.print(city +" ");
        }
    }
}