package Programs.Chapter_37;
import java.util.ArrayList;

public class Ch37_3_Articulation_Point
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
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 0));

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

    public static void DFS(ArrayList<Edge>[] graph, int curr, int par, int[] dt, int[] low, int time,
                           boolean[] visited, boolean[] result)
    {
        visited[curr] = true;
        dt[curr] = low[curr] = ++time;
        int child = 0;

        for(int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if(par == neigh)
            {
                continue;
            }
            else if(visited[neigh])
            {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
            else
            {
                DFS(graph, neigh, curr, dt, low, time, visited, result);
                low[curr] = Math.min(low[curr], low[neigh]);

                if(par != -1 && dt[curr] <= low[neigh])
                {
                    result[curr] = true;
                }

                child++;
            }
        }

        if(par == -1 && child > 1)
        {
            result[curr] = true;
        }
    }

    public static void getArticulationPoint(ArrayList<Edge>[] graph, int V)
    {
        int[] dt = new int[V];
        int[] low = new int[V];
        boolean[] visited = new boolean[V];
        boolean[] result = new boolean[V];
        int time = 0;

        for(int i = 0; i < V; i++)
        {
            if(!visited[i])
            {
                DFS(graph, i, -1, dt, low, time, visited, result);
            }
        }

        for(int i = 0; i < V; i++)
        {
            if(result[i])
            {
                System.out.println("AP : "+ i);
            }
        }
    }

    public static void main(String[] args)
    {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        getArticulationPoint(graph, V);
    }
}