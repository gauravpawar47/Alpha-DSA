package Programs.Chapter_30;
import java.util.HashMap;

public class Ch30_16_Largest_Subarray_Sum_K
{
    public static void main(String[] args)
    {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if(map.containsKey(sum - k))
            {
                ans += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Subarray Sum of K : "+ ans);
    }
}