import java.util.ArrayList;

public class Assignment_1
{
    public static boolean isMonotone(ArrayList<Integer> list)
    {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < list.size() - 1; i++)
        {
            if(list.get(i) < list.get(i + 1))
            {
                decreasing =  false;
            }

            if(list.get(i) > list.get(i + 1))
            {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args)
    {
        // Q 1. Monotone Array
        ArrayList<Integer> list = new ArrayList<>();
 
        list.add(6);
        list.add(4);
        list.add(5);

        System.out.println("Is ArrayList Montone ? : "+ isMonotone(list));
    }
}