package Programs.Chapter_29;
import java.util.PriorityQueue;

public class Ch29_2_PQ_Objects
{
    public static class Student implements Comparable<Student>
    {
        String name;
        int rank;

        public Student(String name, int rank)
        {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s)
        {
            return this.rank - s.rank;
        }
    }

    public static void main(String[] args)
    {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Gaurav Pawar", 121));
        pq.add(new Student("Gaurav Kathe", 512));
        pq.add(new Student("Faizan Khan", 215));
        pq.add(new Student("Vaibhav Bhagwat", 100));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name +" : "+ pq.peek().rank);
            pq.remove();
        }
    }
}