package Programs.Chapter_8;
import java.util.*;

public class Ch8_Assignment_5
{
    public static List<List<Integer>> sum(int nums[])
    {
        List <List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = (i + 1); j < nums.length; j++)
            {
                for(int k = (j + 1); k < nums.length; k++)
                {
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>> (result));
        return result;
    }

    public static void main(String []args)
    {
        // Q. Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k] such taht i != j, i !=
        // k and j != k and nums[i] + nums[j] + nums[k] == 0 notice that the solution set must not contain duplicate
        // triplets

        int nums[] = {1, 2, 3, 4};

        sum(nums);
    }
}