package Programs.Chapter_36;
import java.util.PriorityQueue;

public class Ch36_2_Connecting_Cities_Minimum_Cost
{
    public static class Edge implements Comparable<Edge>
    {
        int dest;
        int cost;

        public Edge(int dest, int cost)
        {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e)
        {
            return this.cost - e.cost;
        }
    }

    public static int connectingCities(int[][] cities)
    {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[cities.length];
        pq.add(new Edge(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty())
        {
            Edge curr = pq.remove();
            if(!visited[curr.dest])
            {
                visited[curr.dest] = true;
                finalCost += curr.cost;
                for(int i = 0; i < cities[curr.dest].length; i++)
                {
                    if(cities[curr.dest][i] != 0)
                    {
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost;
    }

    public static void main(String[] args)
    {
        int[][] cities = {{0, 1, 2, 3, 4},
                          {1, 0, 5, 0, 7},
                          {2, 5, 0, 6, 0},
                          {3, 0, 6, 0, 0},
                          {4, 7, 0, 0, 0}};

        System.out.println("Minimum Cost For Connecting Cities : "+ connectingCities(cities));
    }
}