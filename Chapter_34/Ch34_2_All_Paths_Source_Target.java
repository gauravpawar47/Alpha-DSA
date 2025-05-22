package Programs.Chapter_34;
import java.util.ArrayList;

public class Ch34_2_All_Paths_Source_Target
{
    public static class Edge
    {
        int src;
        int dest;

        public Edge(int src, int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        // Vertex 0
        graph[0].add(new Edge(0, 3));

        // Vertex 2
        graph[2].add(new Edge(2, 3));

        // Vertex 3
        graph[3].add(new Edge(3, 1));

        // Vertex 4
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        // Vertex 5
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void allPaths(ArrayList<Edge>[] graph, int src, int dest, String path)
    {
        // Base-Case
        if(src == dest)
        {
            System.out.println("Path : "+ (path + dest));
            return;
        }

        // Recursion
        for(int i = 0; i < graph[src].size(); i++)
        {
            Edge e = graph[src].get(i);
            allPaths(graph, e.dest, dest, path + src);
        }
    }

    public static void main(String[] args)
    {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        allPaths(graph, 5, 1, "");
    }
}