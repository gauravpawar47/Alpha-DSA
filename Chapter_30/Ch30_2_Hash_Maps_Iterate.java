package Programs.Chapter_30;
import java.util.HashMap;
import java.util.Set;

public class Ch30_2_Hash_Maps_Iterate
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> country = new HashMap<>();

        country.put("India", 150);
        country.put("UK", 70);
        country.put("USA", 120);
        country.put("UAE", 110);
        country.put("China", 80);

        Set<String> keys = country.keySet();

        System.out.println("Keys : "+ keys +"\n");
        for(String key : keys)
        {
            System.out.println(key +" - "+ country.get(key));
        }
    }
}