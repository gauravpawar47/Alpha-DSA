package Programs.Chapter_29;
import java.util.PriorityQueue;

public class Ch29_6_Connect_N_Ropes
{
    public static void main(String[] args)
    {
        int[] ropes = {4, 3, 2, 6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < ropes.length; i++)
        {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size() > 1)
        {
            int min = pq.remove() + pq.remove();
            cost += min;
            pq.add(min);
        }
        System.out.println("Minimum Cost to Connect "+ ropes.length +" is : "+ cost);
    }
}