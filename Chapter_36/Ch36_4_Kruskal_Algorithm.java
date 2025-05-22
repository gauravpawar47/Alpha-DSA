package Programs.Chapter_36;
import java.util.ArrayList;
import java.util.Collections;

public class Ch36_4_Kruskal_Algorithm
{
    public static class Edge implements Comparable<Edge>
    {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt)
        {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e)
        {
            return this.wt - e.wt;
        }
    }

    public static void createGraph(ArrayList<Edge> edges)
    {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 2, 40));
        edges.add(new Edge(2, 3, 50));
    }

    public static int n = 4;
    public static int[] par = new int[n];
    public static int[] rank = new int[n];

    public static void init()
    {
        for(int i = 0; i < n; i++)
        {
            par[i] = i;
        }
    }

    public static int find(int x)
    {
        if(par[x] == x)
        {
            return x;
        }

        return par[x] = find(par[x]);
    }

    public static void union(int a, int b)
    {
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB])
        {
            par[parB] = parA;
            rank[parA]++;
        }
        else if(rank[parA] < rank[parB])
        {
            rank[parA] = parB;
        }
        else
        {
            rank[parB] = parA;
        }
    }

    public static void kruskalAlgorithm(ArrayList<Edge> edges, int V)
    {
        init();
        Collections.sort(edges);

        int cost = 0;
        int count = 0;

        for(int i = 0; count < V - 1; i++)
        {
            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);

            if(parA != parB)
            {
                union(e.src, e.dest);
                cost += e.wt;
                count++;
            }
        }
        System.out.println("Cost : "+ cost);
    }

    public static void main(String[] args)
    {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();

        createGraph(edges);
        kruskalAlgorithm(edges, V);
    }
}