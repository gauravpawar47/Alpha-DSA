import java.util.*;

public class _15_Pair_Sum_2
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

    public static boolean optimized1(ArrayList<Integer> list, int target)
    {
        int breakPoint = -1;
        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) > list.get(i + 1))
            {
                breakPoint = i + 1;
                break;
            }
        }

        int left = breakPoint;
        int right = left - 1;

        while(left != right)
        {
            if(list.get(left) + list.get(right) == target)
            {
                return true;
            }
            
            if(list.get(left) + list.get(right) < target)
            {
                left = (left + 1) % list.size();
            }
            else
            {
                right = (list.size() + right -  1) % list.size();
            }
        }

        return false;
    }

    public static boolean optimized2(ArrayList<Integer> list, int target)
    {
        int breakPoint = -1;
        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) > list.get(i + 1))
            {
                breakPoint = i + 1;
                break;
            }
        }

        int left = breakPoint;
        int right = left - 1;

        while(left != right)
        {
            if(list.get(left) + list.get(right) == target)
            {
                return true;
            }
            
            if(target <= list.get(right))
            {
                right = (list.size() + right -  1) % list.size();
            }
            else
            {
                left = (left + 1) % list.size();
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        int target = 16;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Pair Exist With Sum of 16 : "+ bruteForce(list, target));
        System.out.println("Pair Exist With Sum of 16 : "+ optimized1(list, target));
        System.out.println("Pair Exist With Sum of 16 : "+ optimized2(list, target));
    }
}