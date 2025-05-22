package Programs.Chapter_30;
import java.util.HashMap;

public class Ch30_6_Majority_Element
{
    public static void main(String[] args)
    {
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        System.out.print("Elements : ");
        for(Integer key : map.keySet())
        {
            if(map.get(key) > nums.length / 3)
            {
                System.out.print(key +" ");
            }
        }
    }
}