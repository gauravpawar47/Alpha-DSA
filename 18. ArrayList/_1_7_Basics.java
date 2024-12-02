import java.util.*;

public class _1_7_Basics
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            list.add(i + 1);
        }

        list.set(1, 55);
        System.out.println("\nSet : "+ list);

        list.remove(1);
        System.out.println("Remove : "+ list);

        System.out.println("Contains : "+ list.contains(4));

        System.out.print("Elements : ");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) +" ");
        }

        int max = Integer.MAX_VALUE;
        System.out.print("\nReverse Order : ");
        for(int i = list.size() - 1; i >= 0; i--)
        {
            System.out.print(list.get(i) +" ");
            max = Math.max(max, list.get(i));
        }

        Collections.sort(list);
        System.out.println("\nAscending Order List : "+ list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order List : "+ list);

        ArrayList<ArrayList<Integer>> mega = new ArrayList<>();

        mega.add(list);
        mega.add(list);

        System.out.println(mega);

        int src = 1;
        int dest = 2;

        System.out.println("Before Swapping : "+ list);
        int temp = list.get(dest);
        list.set(dest, list.get(src));
        list.set(src, temp);
        System.out.println("After  Swapping : "+ list);
    }
}