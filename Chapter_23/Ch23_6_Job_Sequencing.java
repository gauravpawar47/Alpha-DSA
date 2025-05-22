package Programs.Chapter_23;
import java.util.ArrayList;
import java.util.Collections;

public class Ch23_6_Job_Sequencing
{
    public static class Job
    {
        int deadline;
        int profit;
        int id;

        public Job(int id, int deadline, int profit)
        {
            this.id = id;
            this.profit = profit;
            this.deadline = deadline;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Job> jobs = new ArrayList<>();
        int jobsInfo[][] = {{4, 20},
                            {1, 10},
                            {1, 40},
                            {1, 30}};

        // Adding Jobs into ArrayList from JobsInfo
        for(int i = 0; i < jobsInfo.length; i++)
        {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // Sorting Jobs According to the Profit in Descending Order
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> sequence = new ArrayList<>();
        int time = 0;

        // Calculating Maximum Profit from Jobs
        for(int i = 0; i < jobs.size(); i++)
        {
            Job curr = jobs.get(i);
            if(curr.deadline > time)
            {
                sequence.add(curr.id);
                time++;
            }
        }

        // Print Job Sequence
        System.out.println("Maximum Jobs : "+ sequence.size());
        System.out.print("Maximum Profit ID : ");
        for(int i = 0; i < sequence.size(); i++)
        {
            System.out.print(sequence.get(i) +" ");
        }
        System.out.println();
    }
}