package Programs.Chapter_32;
import java.util.ArrayList;

public class Ch32_1_Graph_Creating_Adjacency_List
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

    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        // Vertex 0
        graph[0].add(new Edge(0, 1, 5));

        // Vertex 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // Vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));

        // Vertex 3
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));

        // Vertex 4
        graph[4].add(new Edge(4, 2, 2));

        // Neighbours of all Vertex
        for(int i = 0; i < 5; i++)
        {
            System.out.print(i +" Neighbours : ");
            for(int j = 0; j < graph[i].size(); j++)
            {
                System.out.print(graph[i].get(j).dest +" ");
            }
            System.out.println();
        }
    }
}