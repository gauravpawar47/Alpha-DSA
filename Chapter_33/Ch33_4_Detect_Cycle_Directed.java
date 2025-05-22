package Programs.Chapter_33;
import java.util.ArrayList;

public class Ch33_4_Detect_Cycle_Directed
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
        graph[0].add(new Edge(0, 2));

        // Vertex 1
        graph[1].add(new Edge(1, 3));

        // Vertex 2
        graph[2].add(new Edge(2, 3));
    }

    public static boolean isCyclicUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, boolean[] stack)
    {
        visited[curr] = true;
        stack[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            if(stack[e.dest])
            {
                return true;
            }

            if(!visited[e.dest] && isCyclicUtil(graph, e.dest, visited, stack))
            {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    public static boolean isCycle(ArrayList<Edge>[] graph)
    {
        boolean[] visited = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for(int i = 0; i < graph.length; i++)
        {
            if(!visited[i])
            {
                if(isCyclicUtil(graph, i, visited, stack))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("Cycle Exist ? : "+ isCycle(graph));
    }
}