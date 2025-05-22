package Programs.Chapter_34;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Ch34_1_Topological_Sort_BFS_Kahns
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

    public static void calculateIndegree(ArrayList<Edge>[] graph, int[] inDegree)
    {
        for(int i = 0; i < graph.length; i++)
        {
            int V = i;
            for(int j = 0; j < graph[V].size(); j++)
            {
                Edge e = graph[V].get(j);
                inDegree[e.dest]++;
            }
        }
    }

    public static void topologicalSort(ArrayList<Edge>[] graph)
    {
        // Step 0 : Calculate In-degree of Vertex
        int[] inDegree = new int[graph.length];
        calculateIndegree(graph, inDegree);
        Queue<Integer> q = new LinkedList<>();

        // Step 1 : Add Vertex in Queue having In-degree 0
        for(int i = 0; i < inDegree.length; i++)
        {
            if(inDegree[i] == 0)
            {
                q.add(i);
            }
        }

        // Step 2 : Actual BFS
        while(!q.isEmpty())
        {
            int curr = q.remove();
            System.out.print(curr +" ");

            for(int i = 0; i < graph[curr].size(); i++)
            {
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;

                if(inDegree[e.dest] == 0)
                {
                    q.add(e.dest);
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        topologicalSort(graph);
    }
}