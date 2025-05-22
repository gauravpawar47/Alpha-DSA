package Programs.Chapter_29;
import java.util.PriorityQueue;

public class Ch29_1_PQ_Using_JCF
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(2);

        System.out.print("Elements according to Priority :  ");
        while(!pq.isEmpty())
        {
            System.out.print(pq.remove() +" ");
        }
    }
}