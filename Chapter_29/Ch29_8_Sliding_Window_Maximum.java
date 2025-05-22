package Programs.Chapter_29;
import java.util.PriorityQueue;

public class Ch29_8_Sliding_Window_Maximum
{
    public static class Pair implements Comparable<Pair>
    {
        int data;
        int idx;

        public Pair(int data, int idx)
        {
            this.data = data;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p)
        {
            return p.data - this.data;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] window = new int[arr.length - k + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i < k; i++)
        {
            pq.add(new Pair(arr[i], i));
        }

        window[0] = pq.peek().data;
        for(int i = k; i < arr.length; i++)
        {
            while(pq.size() > 0 && pq.peek().idx <= (i - k))
            {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            window[i - k + 1] = pq.peek().data;
        }

        System.out.print("Windows : ");
        for(int i = 0; i < window.length; i++)
        {
            System.out.print(window[i] +" ");
        }
    }
}