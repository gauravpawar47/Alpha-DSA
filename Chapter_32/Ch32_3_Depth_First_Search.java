package Programs.Chapter_32;
import java.util.ArrayList;

public class Ch32_3_Depth_First_Search
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

    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] visited)
    {
        System.out.print(curr +" ");
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++)
        {
            if(!visited[graph[curr].get(i).dest])
            {
                DFS(graph, graph[curr].get(i).dest, visited);
            }
        }
    }

    public static void main(String[] args)
    {
        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] visited = new boolean[V];
        DFS(graph, 0, visited);
    }
}