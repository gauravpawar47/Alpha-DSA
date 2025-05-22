package Programs.Chapter_29;
import java.util.PriorityQueue;

public class Ch29_5_Nearby_Cars
{
    public static class Point implements Comparable<Point>
    {
        int x;
        int y;
        int distance;
        int idx;

        public Point(int x, int y, int distance, int idx)
        {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.idx = idx;
        }

        public int compareTo(Point p)
        {
            return this.distance - p.distance;
        }
    }

    public static void main(String[] args)
    {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i = 0; i < points.length; i++)
        {
            int dis = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            pq.add(new Point(points[i][0], points[i][1], dis, i));
        }

        for(int i = 0; i < pq.size(); i++)
        {
            System.out.print("C"+ pq.peek().idx +" ");
            pq.remove();
        }
    }
}