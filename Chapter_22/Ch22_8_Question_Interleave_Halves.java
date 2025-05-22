package Programs.Chapter_22;
import java.util.Queue;
import java.util.LinkedList;

public class Ch22_8_Question_Interleave_Halves
{
    public static Queue<Integer> interLeave(Queue<Integer> queue)
    {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = queue.size();

        for(int i = 0; i < size / 2; i++)
        {
            firstHalf.add(queue.remove());
        }

        while(!firstHalf.isEmpty())
        {
            queue.add(firstHalf.remove());
            queue.add(queue.remove());
        }

        return queue;
    }

    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= 10; i++)
        {
            queue.add(i);
        }

        System.out.println("Before Interleaving : "+ queue);
        System.out.println("After  Interleaving : "+ interLeave(queue));
    }
}