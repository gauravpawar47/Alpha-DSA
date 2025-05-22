package Programs.Chapter_8;
import java.util.*;

public class Ch8_00_Revision
{
    public static void _4_UpdateArray(int arr[], String str)
    {
        str = "Changed";
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]++;
        }
    }

    public static int _6_LinearSearch(int arr[], int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int _7_1_LargestArray(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (max <= arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int _7_2_SmallestArray(int arr[])
    {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            if (min >= arr[i])
                min = arr[i];
        }
        return min;
    }

    public static int _8_BinarySearch(int arr[], int key)
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right)
        {
            int mid = (left + right) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static void _10_1_Traversal(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void _10_2_Reverse(int arr[])
    {
        for (int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void _8_Pairs_Array(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void _12_1_SubArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i; j < arr.length; j++)
            {
                for (int k = i; k <= j; k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void _12_2_SubArray_MinMax(int arr[])
    {
        int sum = 0;
        int ts = 0;
        int sumArr[] = new int[arr.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i; j < arr.length; j++)
            {
                sum = 0;
                for (int k = i; k <= j; k++)
                {
                    sum += arr[k];
                }
                ts += 1;
                System.out.println("Total Sum of this Sub Array : " + sum);
            }
            sumArr[i] = sum;
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++)
        {
            if (min >= sumArr[i])
                min = sumArr[i];

            if (max <= sumArr[i])
                max = sumArr[i];
        }

        System.out.println("Total Sub-Arrays : " + ts);
        System.out.println("Maximum Sum : " + max);
        System.out.println("Minimum Sum : " + min);
    }

    public static void _13_MaxSubArraySum(int arr[])
    {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i; j < arr.length; j++)
            {
                sum = 0;
                for (int k = i; k <= j; k++)
                {
                    sum += arr[k];
                }
                System.out.println("Sum of this Sub Array is : "+ sum);

                if (min >= sum)
                    min = sum;
                if (max <= sum)
                    max = sum;
            }
            System.out.println();
        }

        System.out.println("\nMaximum Sum : " + max);
        System.out.println("Minimum Sum : " + min);
    }

    public static void _14_MaxSumPrefix(int arr[])
    {
        int sum = 0;
        int prefix[] = new int[arr.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            prefix[i] = prefix[i - 1] + arr[i];
            System.out.print(prefix[i] +" ");
        }

        System.out.println("\n");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                System.out.print(sum +" ");

                if(min >= sum)
                    min = sum;
                if(max <= sum)
                    max = sum;
            }
            System.out.println();
        }

        System.out.println("\nMaximum Sum : "+ max);
        System.out.println("Minimum Sum : "+ min);

    }

    public static void _15_1_MaxSumKadanes(int arr[])
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if(sum < 0)
                sum = 0;

            if(max <= sum)
                max = sum;
            if(min >= sum)
                min = sum;
        }

        System.out.println("\nMaximum Sum : "+ max);
        System.out.println("Minimum Sum : "+ min);
    }

    public static void _15_2_MaxSumKadanes_Min(int arr[])
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];

            if(sum < 0)
                sum = 0;

            if(max <= sum)
                max = sum;

            if(arr[i] < 0 && min >= arr[i])
                min = arr[i];
        }

        System.out.print("Array Elements : ");
        _10_1_Traversal(arr);
        System.out.println("\nMaximum Sum : "+ max);
        System.out.println("Minimum Sum : "+ min);
    }

    public static int _17_TrappedRainWater(int height[])
    {
        int trappedWater = 0;

        // left max boundary - left[0] = height[0] , loop - left[1] to left[n - 1], left[i] = Math.max(h[i], left[i-1])
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i = 1; i < height.length; i++)
        {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // right max boundary - left[n-1] = height[n-1], loop - right[n-2] to 0, right[i] = Math.max(right[i], h[i+1]
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for(int i = height.length - 2; i >= 0; i--)
        {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for(int i = 0; i < height.length; i++)
        {
            // water level - min(left max[i], right max[i])
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped rain water - water level - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static int _18_BestTimeForStocks(int prices[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else
                buyPrice = prices[i];
        }

        return maxProfit;
    }

    public static boolean Q1_ArrayDuplicate(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static int Q2_1_search(int[] nums, int left, int right, int target)
    {
        int l = left;
        int r = right;

        // System.out.println(left +" "+ right);

        while(l <= r)
        {
            int mid = l + (r - 1) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return - 1;
    }

    // Smallest element index
    public static int Q2_2_minSearch(int []nums)
    {
        int left = 0;
        int right = nums.length - 1;

        while(left < right)
        {
            int mid = left + (right - left) / 2;
            if(mid > 0 && nums[mid - 1] > nums[mid])
                return mid;
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    public static int Q2_3_search(int nums[], int target)
    {
        // min will have index of minimum element of nums
        int min = Q2_2_minSearch(nums);

        // find in sorted left
        if(nums[min] <= target && target <= nums[nums.length - 1])
            return Q2_1_search(nums, min, nums.length - 1, target);
        else    // find in sorted right
            return Q2_1_search(nums, 0, min, target);
    }

    public static int Q3_Stocks(int prices[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else
                buyPrice = prices[i];
        }

        return maxProfit;
    }

    public static int Q4_TrappedRainWater(int height[])
    {
        int trappedWater = 0;

        // left max boundary - left[0] = height[0], left[1] to left[n - 1] , left[i] = max(left[i - 1], height[i])
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i = 1; i < height.length; i++)
        {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // right max boundary - right[n - 1] = height[n - 1], right[n - 2] to 0, right[i] = max(right[i + 1], height[i])
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for(int i = height.length - 2; i >= 0; i--)
        {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for(int i = 0; i < height.length; i++)
        {
            // water level - min(left max boundary, right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water - water level - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static List<List<Integer>> Q5_ArrayTriplets(int nums[])
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                for(int k = 0; k < nums.length; k++)
                {
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        List<Integer> list = new ArrayList<Integer>();

                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        Collections.sort(list);
                        result.add(list);
                    }
                }
            }
        }

        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String[] args)
    {
        // 2 - Array Creation

//        int arr1[] = new int[3];
//
//        arr1[0] = 1;
//        arr1[1] = 2;
//        arr1[2] = 3;
//
//        int arr2[] = {1, 2, 3};

        // 3 - Input/Output

//        Scanner input = new Scanner(System.in);
//        int marks[] = new int[3];
//        int sum = 0;
//
//        for(int i = 0; i < marks.length; i++)
//        {
//            System.out.print("Enter the Marks of "+ (i + 1) +" subject : ");
//            marks[i] = input.nextInt();
//            sum += marks[i];
//        }
//
//        System.out.println();
//        for(int i = 0; i < marks.length; i++)
//        {
//            System.out.println("Marks of "+ (i + 1) +" is : "+ marks[i]);
//        }
//
//        System.out.println("\nSum of All Marks : "+ sum);
//        System.out.println("Average of All Marks : "+ sum / 3);

        // 4 - Array As Function Arguments

//        int arr[] = {96, 97, 98};
//        String str = "Not Changed";
//
//        System.out.println("Before Passing Function Arguments");
//        System.out.println(str);
//        for(int i = 0; i < arr.length; i++)
//        {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("After Passing Function Arguments");
//        _4_UpdateArray(arr, str);
//
//        System.out.println(str);
//        for(int i = 0; i < arr.length; i++)
//        {
//            System.out.println(arr[i]);
//        }

        // 6 - Linear Search

//        int arr[] = {90, 91, 56, 36, 85, 89};
//        int key = 36;
//
//        System.out.println(key +" is Found at : "+ _6_LinearSearch(arr, key) +" Index");

        // 7 - Largest In Array

//        int arr[] = {100, 50 , 150, 75, 350, 120, 90};
//
//        System.out.println("Largest Element in Array : "+ _7_1_LargestArray(arr));
//        System.out.println("Smallest Element in Array : "+ _7_2_SmallestArray(arr));

        // 8 - Binary Search

//        int arr[] = {36, 56, 85, 89, 90, 91};
//        int key = 56;
//
//        System.out.println(key +" is Found at : "+ _8_BinarySearch(arr, key) +" Index");

        // 10 - Reverse An Array

//        int arr[] = {56, 24, 31, 76, 90};
//
//        System.out.println("Array Elements Before Reversing");
//        _10_1_Traversal(arr);
//
//        System.out.println("\nArray Elements After Reversing");
//        _10_2_Reverse(arr);
//        _10_1_Traversal(arr);

        // 11 - Pairs in an Array

//        int arr[] = {2, 4, 6, 8, 10};
//
//        System.out.print("Array Before Pairing : ");
//        _10_1_Traversal(arr);
//
//        System.out.println("\n\nPairs In An Array");
//        _8_Pairs_Array(arr);

        // 12 - Print Sub-arrays

//        int arr[] = {2, 4, 6, 8, 10};
//
//        _12_1_SubArray(arr);
//        _12_2_SubArray_MinMax(arr);

        // 13 - Max Sub-array Sum

//        int arr[] = {1, -2, 6, -1, 3};
//
//        _13_MaxSubArraySum(arr);

        // 14 - Max Sub-array Sum (Prefix)

//        int arr[] = {1, -2, 6, -1, 3};
//
//        _14_MaxSumPrefix(arr);

        // 15 - Max Sub-array Sum (Kadanes)

//        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//        int arr[] = {-1, 2, -5, -3};
//
//        _15_1_MaxSumKadanes(arr);
//        _15_2_MaxSumKadanes_Min(arr);

        // 17 - Trapped Rain Water

//        int height[] = {4, 2, 0, 6, 3, 2, 5};
//
//        System.out.println("Trapped Rain Water : "+ _17_TrappedRainWater(height));

        // 18 - Best Time To Sell and Buy Stocks

//        int prices[] = {7, 1, 5, 3, 6, 4};
//
//        System.out.println("Maximum Profit in Stocks : "+ _18_BestTimeForStocks(prices));

        // Assignment Q1 - Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

//        int arr[] = {1, 2, 3, 1, 5, 6, 7, 6};
//
//        if(Q1_ArrayDuplicate(arr))
//            System.out.println("Duplicate Elements Found");
//        else
//            System.out.println("Duplicate Elements Not Found");

        // Assignment Q2 - There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k(1 <= k < nums.length) such that the resulting array is [nums[k], nums[k + 1], .... nums[n - 1], nums[0], nums[1] ..., nums[k - 1] (0-indexed).

//        int nums[] = {4, 5, 6, 7, 0, 1, 2};
//        int target = 5;
//
//        int index = Q2_3_search(nums, target);
//        System.out.println("Found at : "+ index);

        // Assignment Q3 - You are given an array prices where prices[i] is the price of a given stock on the ith day, Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

//        int prices[] = {7, 1, 5, 3, 6, 4};
//
//        System.out.println("Maximum Profit : "+ Q3_Stocks(prices));

        // Assignment Q4 - Given n non-negative integers representing an elevation map where the width bar is 1, compute how much water it can trap after raining

//        int height[] = {0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 2, 1};
//
//        System.out.println("Trapped Rain Water : "+ Q4_TrappedRainWater(height));

        // Assignment Q5 - Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k and nums[i] + nums[j] + nums[k] == 0. Notice that the soultion set must not contain duplicate triplets

//        int nums[] = {-1, 0, 1, 2, -1, -4};
//
//        System.out.println("Triplets : "+ Q5_ArrayTriplets(nums));
    }
}