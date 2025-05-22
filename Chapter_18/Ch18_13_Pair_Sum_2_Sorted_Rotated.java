package Programs.Chapter_18;
import java.util.ArrayList;

public class Ch18_13_Pair_Sum_2_Sorted_Rotated
{
    public static boolean pairSum2(ArrayList<Integer> list, int target)
    {
        int brkPoint = -1;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) > list.get(i + 1))
            {
                brkPoint = i;
                break;
            }
        }

        int leftPtr = brkPoint + 1;
        int rightPtr = brkPoint;

        while(leftPtr != rightPtr)
        {
            // Case 1 : Target Sum is Found
            if(list.get(leftPtr) + list.get(rightPtr) == target)
            {
                return true;
            }

            // Case 2 : Target Sum is Greater
            if(list.get(leftPtr) + list.get(rightPtr) < target)
            {
                leftPtr = (leftPtr + 1) % list.size();
            }

            // Case 3 : Target Sum is Less
            if(list.get(leftPtr) + list.get(rightPtr) > target)
            {
                rightPtr = (list.size() + rightPtr - 1) % list.size();
            }
        }

        return false;
    }


    public static void main(String []args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 16;

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Status : "+ pairSum2(list, target));
    }
}