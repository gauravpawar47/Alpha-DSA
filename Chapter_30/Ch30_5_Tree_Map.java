package Programs.Chapter_30;
import java.util.TreeMap;

public class Ch30_5_Tree_Map
{
    public static void main(String[] args)
    {
        TreeMap<String, Integer> country = new TreeMap<>();

        country.put("India", 150);
        country.put("USA", 75);
        country.put("UAE", 60);
        country.put("UK", 50);
        country.put("China", 200);

        System.out.println("Elements : "+ country);
    }
}