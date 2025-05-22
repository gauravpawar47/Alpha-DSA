package Programs.Chapter_35;
import java.util.ArrayList;

public class Ch35_1_Bellman_Ford
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
        graph[1].add(new Edge(1, 2, -4));

        // Vertex 2
        graph[2].add(new Edge(2, 3, 2));

        // Vertex 3
        graph[3].add(new Edge(3, 4, 4));

        // Vertex 4
        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src)
    {
        // Step 1 : Initializing MAX value to the elements which i != src
        int[] dist = new int[graph.length];
        for(int i = 0; i < graph.length; i++)
        {
            if(i != src)
            {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        // Step 2 : Calculating Shortest Path for each vertices
        int V = graph.length;
        for(int i = 0; i < V - 1; i++)
        {
            for(int j = 0; j < graph.length; j++)
            {
                for(int k = 0; k < graph[j].size(); k++)
                {
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v])
                    {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        // Step 3 : Print the Shortest Path
        for(int i = 0; i < dist.length; i++)
        {
            System.out.print(dist[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.print("Shortest Path from Source to all Nodes : ");
        bellmanFord(graph, 0);
    }
}