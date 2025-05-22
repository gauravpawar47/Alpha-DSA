package Programs.Chapter_37;
import java.util.ArrayList;
import java.util.Stack;

public class Ch37_1_Strongly_Connected_Components
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
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // Vertex 1
        graph[1].add(new Edge(1, 0));

        // Vertex 2
        graph[2].add(new Edge(2, 1));

        // Vertex 3
        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stk)
    {
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest])
            {
                topSort(graph, e.dest, visited, stk);
            }
        }

        stk.push(curr);
    }

    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] visited)
    {
        visited[curr] = true;
        System.out.print(curr +" ");

        for(int i = 0; i < graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest])
            {
                DFS(graph, e.dest, visited);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge>[] graph, int V)
    {
        // Step 1 : Get the Topological Sort (Store in Stack)
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        for(int i = 0; i < V; i++)
        {
            if(!visited[i])
            {
                topSort(graph, i, visited, stack);
            }
        }

        // Step 2 : Transpose the Graph
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for(int i = 0; i < V; i++)
        {
            visited[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for(int i = 0; i < V; i++)
        {
            for(int j = 0; j < graph[i].size(); j++)
            {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3 : Do DFS according to the stack nodes on transpose graph
        while(!stack.isEmpty())
        {
            int curr = stack.pop();
            if(!visited[curr])
            {
                System.out.print("SCC : ");
                DFS(transpose, curr, visited);
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        kosaraju(graph, V);
    }
}