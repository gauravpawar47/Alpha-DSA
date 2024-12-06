public class Practice_Baktrack
{
    public static void backtrackArray(int[] arr, int i)
    {
        // Step 1 : Base-Case
        if(i == arr.length)
        {
            printArray(arr);
            return;
        }

        // Step 2 : Kaam
        arr[i] = i + 1;

        // Step 3 : Recursion
        backtrackArray(arr, i + 1);

        // Step 4 : Backtrack Step
        arr[i] -= 2;
    }

    public static void printArray(int[] arr)
    {
        System.out.print("Array Elements : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void findSubsets(String str, String result, int i)
    {
        // Step 1 : Base-Case
        if(i == str.length())
        {
            if(result.length() == 0)
            {
                System.out.println("NULL");
            }
            else
            {
                System.out.println(result);
            }
            return;
        }

        // Step 2 : Kaam
        char curr = str.charAt(i);
        // Step 3 : Inner Function Call
        findSubsets(str, result + curr, i + 1);
        findSubsets(str, result, i + 1);
        // Step 4 : Backtrack Step
    }

    public static void findPermutations(String str, String result)
    {
        // Step 1 : Base-Case 
        if(str.length() == 0)
        {
            System.out.println(result);
            return;
        }

        // Step 2 : Kaam
        for(int i = 0; i < str.length(); i++)
        {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Step 3 : Inner Function Call
            findPermutations(newStr, result + curr);
        }
    }

    public static int gridWays(int i, int j, int n, int m)
    {
        // Step 1 : Base-Case
        if(i == n - 1 && j == m - 1)
        {
            return 1;
        }
        else if(i == n || j == m)
        {
            return 0;
        }

        // Step 2 & 3: Kaam & Inner Function Call
        return gridWays(i + 1, j, n, m) + gridWays(i, j + 1, n, m);
    }

    public static void main(String[] args)
    {
        int[] arr = new int[5];

        System.out.println("\n----ARRAY----");
        backtrackArray(arr, 0);
        printArray(arr);

        System.out.println("\n----SUBSETS----");
        String str = "abc";
        findSubsets(str, "", 0);

        System.out.println("\n----ARRAY----");
        findPermutations(str, "");

        System.out.println("\n----GRID WAYS----");
        System.out.println("Grid Ways for 4 X 3 : " + gridWays(0, 0, 4, 3));;

    }
}