public class PracticeSet
{
    public static void Question1(int[] arr, int idx, int key)
    {
        // Base-Case
        if(idx == arr.length)
        {
            return;
        }

        // Kaam
        if(arr[idx] == key)
        {
            System.out.print(idx +" ");
        }
        Question1(arr, idx + 1, key);
    }

    public static void Question2(int num, String[] nums)
    {
        // Base-Case
        if(num == 0)
        {
            return;
        }

        // Kaam
        Question2(num / 10, nums);
        int lastDigit = num % 10;
        System.out.print(nums[lastDigit] +" ");
    }

    public static int Question3(String s, int idx)
    {
        // Base-Case
        if(idx == s.length())
        {
            return idx;
        }

        // Kaam
        return Question3(s, idx + 1);
    }

    public static int Question4(String s, int i, int j, int n)
    {
        // Base-Case
        if(n == 1)
        {
            return 1;
        }

        if(n <= 0)
        {
            return 0;
        }

        // Kaam
        int result = Question4(s, i + 1, j, n - 1) + Question4(s, i, j - 1, n - 1) - Question4(s, i + 1, j - 1, n - 2);

        if(s.charAt(i) == s.charAt(j))
        {
            result += 1;
        }

        return result;
    }

    public static void Question5(int n, String src, String help, String dest)
    {
        // Base-Case
        if(n == 1)
        {
            System.out.println("Trasfer disk "+ n +" from " + src +" to "+ dest);
            return;
        }

        // Kaam
        Question5(n - 1, src, dest, help); // source - helper by using dest as helper
        System.out.println("Trasfer disk "+ n +" from " + src +" to "+ dest);
        Question5(n - 1, help, src, dest); // helper - dest by using source as helper
    }

    public static void main(String[] args)
    {
        // Q 1. Print the Index of Given key from the Array

        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
 
        Question1(arr, 0, key);
        System.out.println();

        // Q 2. Print Word of Digits 1234 - one two three four

        int num = 2019;
        String[] nums = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        
        Question2(num, nums);
        System.out.println();

        // Q 3. Length Of String

        String s = "Gaurav";
        System.out.println("Length Of String : "+ Question3(s, 0));
    
        // Q 4. Find Continous Substring

        String str = "abcab";
        int n = str.length();

        System.out.println("Total Contigous Substring : "+ Question4(str, 0, n - 1, n));
 
        // Q 5. Tower Of Hanoi

        int disks = 3;
        Question5(3, "S", "H", "D");
    }
}