package Programs.Chapter_37;
import java.util.ArrayList;

public class Ch37_2_Bridge_In_Graph
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
            graph[i] = new ArrayList<Edge>();
        }

        // Vertex 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // Vertex 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // Vertex 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // Vertex 3
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        // Vertex 4
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        // Vertex 5
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    public static void DFS(ArrayList<Edge>[] graph, int curr, int par, int[] dt, int[] low, boolean[] visited, int time)
    {
        visited[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i); // e.src  | e.dest
            // Case 1 :
            int neigh = e.dest;
            if(neigh == par)
            {
                continue;
            }

            // Case 2 :
            else if(!visited[neigh])
            {
                DFS(graph, neigh, curr, dt, low, visited, time);
                low[curr] = Math.min(low[curr], low[neigh]);
                if(dt[curr] < low[neigh])
                {
                    System.out.println("Bridge : "+ curr +" ----- "+ neigh);
                }
            }

            // Case 3 :
            else
            {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    public static void tarjanBridge(ArrayList<Edge>[] graph, int V)
    {
        int[] dt = new int[V];
        int[] low = new int[V];
        boolean[] visited = new boolean[V];
        int time = 0;

        for(int i = 0; i < V; i++)
        {
            if(!visited[i])
            {
                DFS(graph, i, -1, dt, low, visited, time);
            }
        }
    }

    public static void main(String[] args)
    {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        tarjanBridge(graph, V);
    }
}