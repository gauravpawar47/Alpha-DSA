import java.util.*;

public class _11_Container_With_Most_Water
{
    public static int bruteForce(ArrayList<Integer> height)
    {
        int maxWater = Integer.MIN_VALUE;
        for(int i = 0; i < height.size(); i++)
        {
            for(int j = i + 1; j < height.size(); j++)
            {
                int currentHeight = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int water = currentHeight * width;
                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }

    public static int optimized(ArrayList<Integer> height)
    {
        int maxWater = Integer.MIN_VALUE;
        int left = 0;
        int right = height.size() - 1;

        while(left < right)
        {
            int ht = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int water = ht * width;
            maxWater = Math.max(water, maxWater);

            if(height.get(left) < height.get(right))
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Container With Most Water (Brute Force) : "+ bruteForce(height));
        System.out.println("Container With Most Water (Optimized)   : "+ optimized(height));
    }
}