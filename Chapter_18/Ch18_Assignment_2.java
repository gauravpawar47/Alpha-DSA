package Programs.Chapter_18;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ch18_Assignment_2
{
    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list)
    {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        HashSet<Integer> elementsSet = new HashSet<>(list);

        // Build the frequency map
        for (int num : list)
        {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else
            {
                frequencyMap.put(num, 1);
            }
        }

        // Find lonely numbers
        for (int num : list)
        {
            if (frequencyMap.get(num) == 1 && !elementsSet.contains(num + 1) && !elementsSet.contains(num - 1))
            {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println("Lonely Elements : " + lonelyNumbers(list));
    }
}