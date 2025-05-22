package Programs.Chapter_33;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Ch33_3_Bipartite_Graph
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
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // Vertex 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // Vertex 3
        graph[3].add(new Edge(3, 1));
//        graph[3].add(new Edge(3, 4));

        // Vertex 4
//        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph)
    {
        int[] color = new int[graph.length];

        for(int i = 0; i < color.length; i++)
        {
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < graph.length; i++)
        {
            if(color[i] == -1)
            {
                q.add(i);
                color[i] = 0; // yellow

                while(!q.isEmpty())
                {
                    int curr = q.remove();
                    for(int j = 0; j < graph[curr].size(); j++)
                    {
                        Edge e = graph[curr].get(j);

                        if(color[e.dest] == -1)
                        {
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextColor;
                            q.add(e.dest);
                        }
                        else if(color[e.dest] == color[curr])
                        {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("Graph is Bipartite : "+ isBipartite(graph));
    }
}