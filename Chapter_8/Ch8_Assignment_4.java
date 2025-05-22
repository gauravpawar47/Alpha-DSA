package Programs.Chapter_8;

public class Ch8_Assignment_4
{
    public static void traversal(int arr[], String name)
    {
        System.out.print(name +" : ");
        for(int a : arr)
        {
            System.out.print(a +" ");
        }
        System.out.println();
    }

    public static int trappedRainWater(int height[])
    {
        // Q. Given n Non-Negative integers representing an elevation map where the width of bar is 1, compute how
        // much water it can trap after raining

        // traversal(height, "Height"); // For Dry Run Purpose

        // leftMax Boundary calculate
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i = 1; i < height.length; i++)
        {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // traversal(leftMax, "Left Max"); // For Dry Run Purpose

        // RightMax Boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for(int i = height.length - 2; i >= 0; i--)
        {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // traversal(rightMax, "Right Max"); // For Dry Run Purpose
        System.out.println();

        // Loop
        int trappedRainWater = 0;
        for(int i = 0; i < height.length; i++)
        {
            // Calculate minimum of leftMax and RightMax which will determine Waterlevel
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Calculate trapped rain water by subtracting waterlevel - height[i]
            trappedRainWater += waterLevel - height[i];
            System.out.print(waterLevel - height[i] +" ");
        }
        return trappedRainWater;
    }

    public static void main(String []args)
    {
        int height[] = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println("\n\nTotal Trapped Rain Water : "+ trappedRainWater(height));
    }
}