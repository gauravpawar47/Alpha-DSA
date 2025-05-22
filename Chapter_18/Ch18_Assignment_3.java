package Programs.Chapter_18;
import java.util.ArrayList;

public class Ch18_Assignment_3
{
    public static int mostFrequent(ArrayList<Integer> nums, int key)
    {
        int[]result = new int[1000];
        for(int i=0; i<nums.size()-1; i++)
        {
            if(nums.get(i) == key)
            {
                result[nums.get(i+1)-1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++)
        {
            if(result[i] > max)
            {
                max = result[i];
                ans = i+1;
            }
        }

        return ans;
    }

    public static void main(String []args)
    {
        int key = 2;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println("Target with Maximum Count : "+ mostFrequent(list, key));
    }
}