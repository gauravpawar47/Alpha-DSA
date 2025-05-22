package Programs.Chapter_30;
import java.util.HashSet;

public class Ch30_13_Union_Intersection
{
    public static void main(String[] args)
    {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        // Step 1 : Calculate Union of arr1 and arr2
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr1.length; i++)
        {
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++)
        {
            set.add(arr2[i]);
        }

        int union = set.size();

        // Step  2 : Calculate Intersection of arr1 and arr2
        set.clear();
        for(int i = 0; i < arr1.length; i++)
        {
            set.add(arr1[i]);
        }

        int intersection = 0;
        for(int i = 0; i < arr2.length; i++)
        {
            if(set.contains(arr2[i]))
            {
                intersection++;
                set.remove(arr2[i]);
            }
        }

        System.out.println("Total Union : "+ union);
        System.out.println("Total Intersection : "+ intersection);
    }
}