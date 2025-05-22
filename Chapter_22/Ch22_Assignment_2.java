package Programs.Chapter_22;
import java.util.PriorityQueue;

public class Ch22_Assignment_2
{
    public static int minCost(int[] ropes, int n)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < ropes.length; i++)
        {
            pq.add(ropes[i]);
        }

        int ans = 0;

        while(pq.size() > 1)
        {
            int sum = pq.poll() + pq.poll();
            ans += sum;
            pq.add(sum);
        }

        return ans;
    }

    public static void main(String[] args)
    {
        // Q. Connect n Ropes with Minimum Cost

        int[] ropes =  {4, 3, 2, 6};
        int n = 4;

        System.out.println("Minimum Cost : "+ minCost(ropes, n));
    }
}