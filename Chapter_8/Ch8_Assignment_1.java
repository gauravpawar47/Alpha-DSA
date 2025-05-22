package Programs.Chapter_8;

public class Ch8_Assignment_1
{
    public static boolean traversal(int nums[])
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = (i + 1); j < nums.length; j++)
            {
                System.out.print("("+ nums[i] +","+ nums[j] +") ");
                if(nums[i] == nums[j])
                    return true;
            }
            System.out.println();
        }
        return false;
    }

    public static void main(String []args)
    {
        // Q. Given an integer array nums, return true if any value appears at least twice in the array, and return
        // false if every element is distinct

        int nums[]= {1, 2, 3, 4, 5};

        boolean status = traversal(nums);
        System.out.println("\n\nStatus : "+ status);
    }
}