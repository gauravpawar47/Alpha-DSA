package Programs.Chapter_23;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ch23_1_Activity_Selection
{
    public static void main(String[] args)
    {
        // End Array Is Sorted

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int maxAct = 0; // No of Activities
        ArrayList<Integer> activity = new ArrayList<>(); // Activity Index Storing

        // 1st Activity
        maxAct = 1;
        activity.add(0);
        int endTime = end[0]; // End Time of Activity 1

        for(int i = 1; i < start.length; i++)
        {
            // Selecting Activity
            if(start[i] >= endTime)
            {
                maxAct++;
                activity.add(i);
                endTime = end[i];
            }
        }
        System.out.println("Total   Activities : "+ maxAct);
        System.out.print("Maximum Activities : ");
        for(int i = 0; i < activity.size(); i++)
        {
            System.out.print("A"+ activity.get(i) +" ");
        }

        // Start Array Sorted

//        int[] start = {1, 3, 0, 5, 8, 5};
//        int[] end = {2, 4, 6, 7, 9, 9};
//
//        int[][] activities = new int[start.length][3];
//        for(int i = 0; i < start.length; i++)
//        {
//            activities[i][0] = i;
//            activities[i][1] = start[i];
//            activities[i][2] = end[i];
//        }
//
//        // Lamdba function -> shortform (Sorting end Array)
//        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
//
//        int maxAct = 0; // No of Activities
//        ArrayList<Integer> activity = new ArrayList<>(); // Activity Index Storing
//
//        // 1st Activity
//        maxAct = 1;
//        activity.add(activities[0][0]);
//        int endTime = activities[0][2]; // End Time of Activity 1
//
//        for(int i = 1; i < start.length; i++)
//        {
//            // Selecting Activity
//            if(activities[i][1] >= endTime)
//            {
//                maxAct++;
//                activity.add(activities[i][0]);
//                endTime = activities[i][2];
//            }
//        }
//
//        System.out.println("Total   Activities : "+ maxAct);
//        System.out.print("Maximum Activities : ");
//        for(int i = 0; i < activity.size(); i++)
//        {
//            System.out.print("A"+ activity.get(i) +" ");
//        }
    }
}