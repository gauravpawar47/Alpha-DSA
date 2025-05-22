package Programs.Chapter_22;
import java.util.Deque;
import java.util.LinkedList;

public class Ch22_10_Deque
{
    public static void main(String[] args)
    {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println("Add First    : "+ deque);

        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        System.out.println("Add Last     : "+ deque);

        deque.removeFirst();
        System.out.println("Remove First : "+ deque);

        deque.removeLast();
        System.out.println("Remove Last  : "+ deque);

        System.out.println("Get First    : "+ deque.getFirst());
        System.out.println("Get Last     : "+ deque.getLast());
    }
}