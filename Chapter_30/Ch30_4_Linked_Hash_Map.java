package Programs.Chapter_30;
import java.util.LinkedHashMap;

public class Ch30_4_Linked_Hash_Map
{
    public static void main(String[] args)
    {
        LinkedHashMap<String, Integer> country = new LinkedHashMap<>();

        country.put("India", 150);
        country.put("USA", 75);
        country.put("UAE", 50);
        country.put("UK", 40);
        country.put("China", 200);

        System.out.println("Pairs : "+ country);
    }
}