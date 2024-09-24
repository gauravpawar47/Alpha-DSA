import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class PracticeSet
{
    public static boolean Question1(int[] arr)
    {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] == arr[i + 1])
            {
                return true;
            }
        }

        return false;
    }

    public static int Question2(int[] nums, int target, int si, int ei)
    {
        // Base Case
        if(si > ei)
        {
            return -1;
        }

        // Work
        int mid = si + (ei - si) / 2;

        // Case Found 
        if(nums[mid] == target)
        {
            return mid;
        }

        // Mid on L1
        if(nums[si] <= nums[mid])
        {
            // Case 1 : Left Of L1
            if(target >= nums[si] && target <= nums[mid])
            {
                return Question2(nums, target, si, mid - 1);
            }

            // Case 2 : Right Of L1
            else
            {
                return Question2(nums, target, mid + 1, ei);
            }
        }

        // Mid on L2
        else
        {
            // Case 3 : Right Of L2
            if(target >= nums[mid] && target <= nums[ei])
            {
                return Question2(nums, target, mid + 1, ei);
            }
            
            // Case 4 : Left Of L2
            else
            {
                return Question2(nums, target, si, mid - 1);
            }
        }
    }

    public static int Question3(int[] prices)
    {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
    
        for(int i = 0; i < prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else
            {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static int Question4(int[] height)
    {
        // LeftMax
        int[] leftMax = new int[height.length];

        leftMax[0] = height[0];
        for(int i = 1; i < height.length; i++)
        {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // RightMax
        int[] rightMax = new int[height.length];

        rightMax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--)
        {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Trapped Water
        int trappedWater = 0;

        for(int i = 0; i < height.length; i++)
        {
            // currWater = min(leftMax, rightMax) - height[i];
            int currWater = Math.min(leftMax[i], rightMax[i]) - height[i];
            
            // trappedWater += currWater
            trappedWater += currWater;
        }
        return trappedWater;
    }

    public static List<List<Integer>> Question5(int[] nums)
    {
        List<List<Integer>> result = new ArrayList <List<Integer>> ();

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 1; j  < nums.length; j++)
            {
                for(int k = 2; k < nums.length; k++)
                {
                    if(i != j && i != k && j != k && (nums[i] + nums[j] + nums[k] == 0))
                    {
                        List<Integer> triplet = new ArrayList <Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }

        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
        return result;
    }

    public static void main(String[] args)
    {
        // Q 1. Check if any Duplicate Elements is Present in Array 

        int[] arr = {1, 2, 3};

        System.out.println("Duplicate Elements Present ? : "+ Question1(arr)); 

        // Q. 2 Search in Sorted and Rotated Array

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println("Pivot Index : "+ Question2(nums, target, 0, nums.length - 1));
    
        // Q 3. Best Time to Sell and Buy Stocks

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Max Profit : "+ Question3(prices));

        // Q 4. Trapping Rain Water

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println("Trapped Water : "+ Question4(height));
    
        // Q 5. Triplets | i != j , i != k, j != k, n[i] + n[j] + n[k] = 0 and No Duplicates

        int[] triplet = {-1, 0, 1, 2, -1, -4};

        System.out.println("Triplet : "+ Question5(triplet));
    }
}