import java.util.*;

public class _14_Pair_Sum_1
{
    public static boolean bruteForce(ArrayList<Integer> list, int target)
    {
        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i + 1; j < list.size(); j++)
            {
                if(list.get(i) + list.get(j) == target)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean optimized2(ArrayList<Integer> list, int target)
    {
        int left = 0;
        int right = list.size() - 1;

        while(left < right)
        {
            if(list.get(left) + list.get(right) == target)
            {
                return true;
            }

            if(target <= list.get(right))
            {
                right--;
            }
            else
            {
                left++;
            }
        }

        return false;
    }

    public static boolean optimized1(ArrayList<Integer> list, int target)
    {
        int left = 0;
        int right = list.size() - 1;

        while(left < right)
        {
            if(list.get(left) + list.get(right) == target)
            {
                return true;
            }

            if(list.get(left) + list.get(right) < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return false;
    }


    public static void main(String[] args)
    {
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Pair Exist With Sum of 5 : "+ bruteForce(list, target));
        System.out.println("Pair Exist With Sum of 5 : "+ optimized1(list, target));
        System.out.println("Pair Exist With Sum of 5 : "+ optimized2(list, target));
    }
}