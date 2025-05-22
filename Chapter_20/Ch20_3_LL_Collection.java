package Programs.Chapter_20;
import java.util.LinkedList;

public class Ch20_3_LL_Collection
{
    public static void main(String[] args)
    {
        // Create
        LinkedList<Integer> ll = new LinkedList<>();

        // Add
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(2);
        ll.addFirst(1);

        // Print
        System.out.println("Elements in LinkedList : "+ ll);

        // Remove
        ll.removeFirst();
        ll.removeLast();

        // Print
        System.out.println("Elements in LinkedList : "+ ll);
    }
}