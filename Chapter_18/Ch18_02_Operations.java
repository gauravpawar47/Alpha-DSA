package Programs.Chapter_18;
import java.util.Scanner;
import java.util.ArrayList;

public class Ch18_02_Operations
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the Total Numbers : ");
        int n = input.nextInt();

        for(int i = 0; i < n; i++)
        {
            list.add(i + 1);
        }

        System.out.println("Element at index 2 : "+ list.get(2));
        System.out.println("List : "+ list);

        list.remove(2);
        System.out.println("List after removing element at 2 : "+ list);

        list.set(2, 100);
        System.out.println("Setting 100 on index 2 : "+ list);

        System.out.println("List Contains 3 or not : "+ list.contains(3));
        System.out.println("List Contains 100 or not : "+ list.contains(100));
    }
}