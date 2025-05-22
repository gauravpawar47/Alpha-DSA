package Programs.Chapter_22;
import java.util.ArrayList;
import java.util.Collections;

public class Ch22_Assignment_3
{
    public static class Job
    {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit)
        {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args)
    {
        // Q. Job Sequencing Problem
        ArrayList<Job> jobs = new ArrayList<>();
        int jobsInfo[][] = {{4, 20},
                {1, 10},
                {1, 40},
                {1, 30}};

        for(int i = 0; i < jobsInfo.length; i++)
        {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for(int i = 0; i < jobs.size(); i++)
        {
            Job curr = jobs.get(i);
            if(curr.deadline > time)
            {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Maximum Profit Jobs : "+ seq);
    }
}