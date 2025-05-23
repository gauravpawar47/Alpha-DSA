package Programs.Chapter_33;
import java.util.ArrayList;
import java.util.Stack;

public class Ch33_5_Topological_Sorting
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

    public static void topologicalSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack)
    {
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest])
            {
                topologicalSortUtil(graph, e.dest, visited, stack);
            }
        }

        stack.push(curr);
    }

    public static void topologicalSort(ArrayList<Edge>[] graph)
    {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < graph.length; i++)
        {
            if(!visited[i])
            {
                topologicalSortUtil(graph, i, visited, stack);
            }
        }

        while(!stack.isEmpty())
        {
            System.out.print(stack.pop() +" ");
        }
    }

    public static void main(String[] args)
    {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topologicalSort(graph);
    }
}