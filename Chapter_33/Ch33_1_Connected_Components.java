package Programs.Chapter_33;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Ch33_1_Connected_Components
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

    public static void BFS(ArrayList<Edge>[] graph)
    {
        boolean[] visited  = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++)
        {
            if(!visited[i])
            {
                bfs_UTIL(graph, visited);
            }
        }
    }

    public static void bfs_UTIL(ArrayList<Edge>[] graph, boolean[] visited)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while(!q.isEmpty())
        {
            int curr = q.remove();

            if(!visited[curr])
            {
                System.out.print(curr +" ");
                visited[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++)
                {
                    q.add(graph[curr].get(i).dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge>[] graph)
    {
        boolean visited[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++)
        {
            dfs_UTIL(graph, i, visited);
        }
    }

    public static void dfs_UTIL(ArrayList<Edge>[] graph, int curr, boolean[] visited)
    {
        System.out.print(curr +" ");
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++)
        {
            if(!visited[graph[curr].get(i).dest])
            {
                dfs_UTIL(graph, graph[curr].get(i).dest, visited);
            }
        }
    }

    public static void main(String[] args)
    {

    }
}