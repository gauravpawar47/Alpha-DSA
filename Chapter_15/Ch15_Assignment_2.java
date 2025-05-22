package Programs.Chapter_15;

public class Ch15_Assignment_2
{
    public static int countInRange(int nums[], int num, int si, int ei)
    {
        int count = 0;

        for(int i = si; i <= ei; i++)
        {
            if(nums[i] == num)
                count += 1;
        }

        return count;
    }

    public static int majorityElementRec(int nums[], int si, int ei)
    {
        if(si == ei)
            return nums[si];

        int mid = (ei - si) / 2 + si;
        int left = majorityElementRec(nums, si, mid);
        int right = majorityElementRec(nums, mid + 1, ei);

        if(left == right)
            return left;

        int leftCount = countInRange(nums, left, si, ei);
        int rightCount = countInRange(nums, right, si, ei);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int nums[])
    {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    public static void main(String[] args)
    {
        // Q. Given an array nums of size n, return the majority element

        int nums[] = {2, 2, 1, 1, 2, 2};

        System.out.println("Highest Majority Element : "+ majorityElement(nums));
    }
}