public class PracticeSet
{
    public static String[] Question1(String[] arr, int si, int ei)
    {
        // Base-Case
        if(si == ei)
        {
            return new String[]{arr[si]};
        }

        // Kaam
        int mid = si + (ei - si) / 2;
        String[] s1 = Question1(arr, si, mid); // Left
        String[] s2 = Question1(arr, mid + 1, ei); // Right
    
        return merge(s1, s2);
    }

    public static int count(int[] arr, int n, int si, int ei)
    {
        int count = 0;
        for(int i = si; i <= ei; i++)
        {
            if(arr[i] == n)
            {
                count += 1;
            }
        }
        return count;
    }

    public static int Question2(int[] arr, int si, int ei)
    {
        // Base-Case
        if(si == ei)
        {
            return arr[si];
        }

        // Kaam
        int mid = si + (ei - si) / 2;
        int left = Question2(arr, si, mid);
        int right = Question2(arr, mid + 1, ei);

        // Step 1 : Both are Equal
        if(left == right)
        {
            return left;
        }

        // Step 2 : Count Each Element
        int lCount = count(arr, left, si, ei);
        int rCount = count(arr, right, si, ei);

        return lCount > rCount ? lCount : rCount;
    }

    public static String[] merge(String[] s1, String[] s2)
    {
        // Step 0 : Initializing Variables
        int m = s1.length;
        int n = s2.length;
        String[] s = new String[m + n];
        int idx = 0;
        int i = 0;
        int j = 0;
        
        // Step 1 : Comapre String Characters
        while(i < m && j < n)
        {
            if(isAlphabeticallySmaller(s1[i], s2[j]))
            {
                s[idx] = s1[i];
                i++;
            }
            else
            {
                s[idx] = s2[j];
                j++;
            }
            idx++;
        }

        // Step 2 : Copy Remaining s1 elements to s
        while(i < m)
        {
            s[idx++] = s1[i++];
        }
        
        // Step 3 : Copy Remaining s1 elements to s
        while(j < n)
        {
            s[idx++] = s2[j++];
        }

        return s; 
    }

    public static boolean isAlphabeticallySmaller(String s1, String s2)
    {
        return s1.compareTo(s2) < 0;
    }

    public static void print(String[] arr)
    {
        System.out.print("Array Elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static int helper(int[] arr, int left, int mid, int right)
    {
        // Step 0 : Initializing Variables
        int i = left;
        int j = mid;
        int k = 0;
        int count = 0;
        int[] nums = new int[right - left + 1];

        // Step 1 : Compare Variables
        while(i < mid && j <= right)
        {
            if(arr[i] <= arr[j])
            {
                nums[k] = arr[i];
                i++;
            }
            else
            {
                nums[k] = arr[j];
                j++;
                count += 1;
            }
            k++;
        }

        // Step 2 : Copy Remaining s1 elements to s
        while(i < mid)
        {
            nums[k++] = arr[i++];
        }
        
        // Step 3 : Copy Remaining s1 elements to s
        while(j <= right)
        {
            nums[k++] = arr[j++];
        }

        // Step 4 : Reshifiting The Elements
        for(i = left, k = 0; i <= right; i++, k++)
        {
            arr[i] = nums[k];
        }

        return count;
    }

    public static int Question3(int[] arr, int si, int ei)
    {
        // Base-Case
        int inversionCount = 0;

        if(ei > si)
        {
            // Kaam
            int mid = si + (ei - si) / 2;
            inversionCount += Question3(arr, si, mid);
            inversionCount += Question3(arr, mid + 1, ei);
            inversionCount += helper(arr, si, mid + 1, ei);
        }

        return inversionCount;
    }

    public static void main(String[] args)
    {
        // Q 1. Apply Merge Sort on Array Of String
        String[] arr = {"sun", "earth", "mars", "mercury"};
        print(arr);

        String[] result = Question1(arr, 0, arr.length - 1);
        print(result);

        // Q 2. Majority Element

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element : "+ Question2(nums, 0, nums.length - 1));
    
        // Q 3. Find the Inversion Count

        int[] n = {2, 4, 1, 3, 5};
        System.out.println("Inversion Count : "+ Question3(nums, 0, n.length - 1));
    }
}