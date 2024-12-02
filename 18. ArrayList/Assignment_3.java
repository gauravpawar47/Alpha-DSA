import java.util.*;

public class Assignment_3
{
    public static int mostFrequent(ArrayList<Integer> nums, int key)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.size() - 1; i++)
        {
            if(nums.get(i) == key)
            {
                map.put(nums.get(i + 1), map.getOrDefault(nums.get(i + 1), 0) + 1);
            }
        }

        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue())
            {
                maxEntry = entry;
            }
        }   

        if (maxEntry != null)
        {
            return maxEntry.getKey();
        }
        else
        {
            return -1;
        } 
    }

    public static void main(String[] args)
    {
        // Q 3. Most Frequent Number Following Key
        
        int key = 1;
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);

        System.out.println("Most Frequent Number Following Key : "+ mostFrequent(list, key));
    }
}