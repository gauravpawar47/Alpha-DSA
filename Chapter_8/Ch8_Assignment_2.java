package Programs.Chapter_8;

public class Ch8_Assignment_2
{
    // binary search to find target in left to right boundary
    public static int search(int[] nums, int left, int right, int target)
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
    public static int minSearch(int []nums)
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

    public static int search(int nums[], int target)
    {
        // min will have index of minimum element of nums
        int min = minSearch(nums);

        // find in sorted left
        if(nums[min] <= target && target <= nums[nums.length - 1])
            return search(nums, min, nums.length - 1, target);
        else    // find in sorted right
            return search(nums, 0, min, target);
    }

    public static void main(String[] args)
    {
        // Q. There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k(1 <= k < nums.length) such that the resulting array is [nums[k], nums[k + 1], .... nums[n - 1], nums[0], nums[1] ..., nums[k - 1] (0-indexed).
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 5;

        int index = search(nums, target);
        System.out.println("Found at : "+ index);
    }
}