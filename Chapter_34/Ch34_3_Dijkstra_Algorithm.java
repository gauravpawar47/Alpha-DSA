package Programs.Chapter_34;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Ch34_3_Dijkstra_Algorithm
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

    public static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        // Vertex 0
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // Vertex 1
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        // Vertex 2
        graph[2].add(new Edge(2, 4, 3));

        // Vertex 3
        graph[3].add(new Edge(3, 5, 1));

        // Vertex 4
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair>
    {
        int n;
        int path;

        public Pair(int n, int path)
        {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p)
        {
            return this.path - p.path;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src)
    {
        int[] dist = new int[graph.length];

        // Step 1 : Initial Distance src -> i = Infinity
        for(int i = 0; i < graph.length; i++)
        {
            if(i != src)
            {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        // Step 2 : Creating Priority Queue and visited array for Vertices
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[graph.length];
        pq.add(new Pair(src, 0));

        // Step 3 : BFS
        while(!pq.isEmpty())
        {
            Pair curr = pq.remove();
            if(!visited[curr.n])
            {
                // Step 4 : Visits Neighbour
                visited[curr.n] = true;

                for(int i = 0; i < graph[curr.n].size(); i++)
                {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v])
                    {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        // Step 5 : Print the Path
        for(int i = 0; i < dist.length; i++)
        {
            System.out.print(dist[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.print("Shortest Path : ");
        dijkstra(graph, 0);
    }
}