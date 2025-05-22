package Programs.Chapter_18;
import java.util.ArrayList;

public class Ch18_11_Pair_Sum_1_Brute_Force
{
    public static boolean pairSum1_BF(ArrayList<Integer> list, int target)
    {
        for(int i = 0; i < list.size() - 1; i++)
        {
            for(int j = i + 1; j < list.size() - 1; j++)
            {
                if(list.get(i) + list.get(j) == target)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;

        for(int i = 1; i <= 5; i++)
        {
            list.add(i);
        }
        System.out.println("Status : "+ pairSum1_BF(list, target));
    }
}