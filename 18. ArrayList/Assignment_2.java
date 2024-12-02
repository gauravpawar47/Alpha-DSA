import java.util.*;

public class Assignment_2
{
    public static List<Integer> findLonely(ArrayList<Integer> nums)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums.size(); i++)
        {
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
        }

        for(int i = 0; i < nums.size(); i++)
        {
            if((map.get(nums.get(i)) <= 1 && map.containsKey(nums.get(i) + 1) == false && map.containsKey(nums.get(i) - 1) == false))
            {
                list.add(nums.get(i));
            }
        }

        return list;    
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println("Lonely Elements : "+ findLonely(list));
    }
}