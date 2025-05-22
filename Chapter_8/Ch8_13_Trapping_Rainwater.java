package Programs.Chapter_8;

public class    Ch8_13_Trapping_Rainwater
{
    public static int trappedRainwater(int height[])
    {
        // calculate left max boundary - leftArray
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i = 1; i < height.length; i++)
        {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            System.out.print(leftMax[i] +" ");
        }
        System.out.println();

        // calculate right max boundary - rightArray
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for(int i = height.length - 2; i >= 0; i--)
        {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
            System.out.print(rightMax[i] +" ");
        }
        System.out.println();


        int trappedWater = 0;
        // loop
        for(int i = 0; i < height.length; i++)
        {
            // waterlevel - min(leftBoundary, rightBoundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water - (waterlevel - height)
            trappedWater += waterLevel - height[i];
             System.out.print(trappedWater +" ");
        }
        return trappedWater;        // {4, 2, 0, 6, 3, 2, 5};
    }

    public static void main(String []args)
    {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("\n\nTotal Trapped Rain Water : "+ trappedRainwater(height));
    }
}