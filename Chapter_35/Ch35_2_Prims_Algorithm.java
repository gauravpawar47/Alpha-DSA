package Programs.Chapter_35;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Ch35_2_Prims_Algorithm
{
    public static class Edge
    {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt)
        {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static  void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        // Vertex 0
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        // Vertex 1
        graph[1].add(new Edge(1, 3, 40));

        // Vertex 2
        graph[2].add(new Edge(2, 3, 50));
    }

    public static class Pair implements Comparable<Pair>
    {
        int v;
        int cost;

        public Pair(int v, int cost)
        {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p)
        {
            return this.cost - p.cost;
        }
    }

    public static int primsAlgorithm(ArrayList<Edge>[] graph)
    {
        // Step 1 : Initializing Priority Queue for Storing Vertex
        boolean[] visited = new boolean[graph.length];
        int finalCost = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));

        // Step 2 : Calculating Minimum cost for each Vertex and then adding them in Priority Queue
        while(!pq.isEmpty())
        {
            Pair curr = pq.remove();
            if(!visited[curr.v])
            {
                visited[curr.v] = true;
                finalCost += curr.cost;
            }

            for(int i = 0; i < graph[curr.v].size(); i++)
            {
                Edge e = graph[curr.v].get(i);
                pq.add(new Pair(e.dest, e.wt));
            }
        }

        return finalCost;
    }

    public static void main(String[] args)
    {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("MST Cost Using Prims Algorithm : "+ primsAlgorithm(graph));
    }
}