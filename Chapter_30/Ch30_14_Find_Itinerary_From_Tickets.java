package Programs.Chapter_30;
import java.util.HashMap;

public class Ch30_14_Find_Itinerary_From_Tickets
{
    public static String getStart(HashMap<String, String> tickets)
    {
        // Step 1 : Inserting elements in reverse order
        HashMap<String, String> revMap = new HashMap<>();
        for(String key : tickets.keySet())
        {
            revMap.put(tickets.get(key), key);
        }

        // Step 2 : Finding Starting Point
        for(String key : tickets.keySet())
        {
            if(!revMap.containsKey(key))
            {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);

        for(String key : tickets.keySet())
        {
            System.out.print(" -> "+ tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}