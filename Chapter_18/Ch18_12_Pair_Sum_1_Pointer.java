package Programs.Chapter_18;
import java.util.ArrayList;

public class Ch18_12_Pair_Sum_1_Pointer
{
    public static boolean pairSum2_Pointer(ArrayList<Integer> list, int target)
    {
        int lp = 0;
        int rp = list.size() - 1;

        while(lp < rp)
        {
            // Case 1 : Target Sum Found
            if(list.get(lp) + list.get(rp) == target)
            {
                return true;
            }

            // Case 2 : Target Sum is Greater
            if(list.get(lp) + list.get(rp) < target)
            {
                lp++;
            }

            // Case 3 : Target Sum is Less
            if(list.get(lp) + list.get(rp) > target)
            {
                rp--;
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

        System.out.println("Status : "+ pairSum2_Pointer(list, target));
    }
}