package Programs.Chapter_32;
import java.util.ArrayList;

public class Ch32_4_Has_Path_DFS
{
    public static class Edge
    {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight)
        {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph)
    {
        for(int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        // Vertex 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // Vertex 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // Vertex 2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // Vertex 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 5, 1));

        // Vertex 4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));

        // Vertex 5
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // Vertex 6
        graph[6].add(new Edge(6, 1, 1));
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited)
    {
        if(src == dest)
        {
            return true;
        }

        visited[src] = true;
        for(int i = 0; i < graph[src].size(); i++)
        {
            Edge e = graph[src].get(i);
            if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited))
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("Has Path 0 to 5 : "+ hasPath(graph, 0, 5, new boolean[V]));
    }
}