package Programs.Chapter_33;
import java.util.ArrayList;

public class Ch33_2_Detect_Cycle_Undirected
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
        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // Vertex 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // Vertex 2
//        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // Vertex 3
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // Vertex 4
        graph[4].add(new Edge(4, 3));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph)
    {
        boolean[] visited = new boolean[graph.length];

        for(int i = 0; i < graph.length; i++)
        {
            if(!visited[i])
            {
                if(detectCycleUtil(graph, visited, i, -1))
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int par)
    {
        visited[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);

            // Case 3
            if(!visited[e.dest])
            {
                if(detectCycleUtil(graph, visited, e.dest, curr))
                {
                    return true;
                }
            }

            // Case 2
            else if(visited[e.dest] && e.dest != par)
            {
                return true;
            }

            // Case 1 : Do Nothing
        }

        return false;
    }

    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("Cycle Exist ? : "+ detectCycle(graph));
    }
}