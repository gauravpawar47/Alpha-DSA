package Programs.Chapter_18;
import java.util.ArrayList;

public class Ch18_06_Swap_2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Before swapping element at index 2 and 4 : "+ list);

        int temp = list.get(2);
        list.set(2, list.get(4));
        list.set(4, temp);

        System.out.println("After swapping element at index 2 and 4 : "+ list);
    }
}