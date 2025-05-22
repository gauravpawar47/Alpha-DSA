package Programs.Chapter_30;
import java.util.HashMap;

public class Ch30_1_Hash_Map_Operation
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> country = new HashMap<>();

        // Operation 1 - put
        country.put("China", 150);
        country.put("India", 100);
        country.put("USA", 75);
        country.put("UAE", 50);

        System.out.println("\nHash Map Elements : "+ country);

        // Operation 2 - get
        System.out.println("India's Population : "+ country.get("India"));

        // Operation 3 - containsKey
        System.out.println("\nUSA is in HashMap ? : "+ country.containsKey("USA"));
        System.out.println("UK  is in HashMap ? : "+ country.containsKey("UK"));

        // Operation 4 - remove
        country.remove("UAE");
        System.out.println("\nHash Map Elements :  "+ country);

        // Supplementary Functions
        System.out.println("\nSize of Hash Map : "+ country.size());
        System.out.println("Hash Map is Empty ? : "+ country.isEmpty());
        country.clear();
        System.out.println("Hash Map Elements : "+ country);
    }
}