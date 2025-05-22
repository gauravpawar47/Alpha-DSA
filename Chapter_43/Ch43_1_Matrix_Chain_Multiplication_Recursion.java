package Programs.Chapter_43;

public class Ch43_1_Matrix_Chain_Multiplication_Recursion
{
    public static int mcmRecursion(int[] arr, int i, int j)
    {
        if(i == j)
        {
            return 0;
        }

        int minCost = Integer.MAX_VALUE;
        for(int k = i; k <= j - 1; k++)
        {
            int cost1 = mcmRecursion(arr, i, k);
            int cost2 = mcmRecursion(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }
        return minCost;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 3};;
        int n = arr.length;
        System.out.println("Minimum Cost : "+ mcmRecursion(arr, 1, n - 1));
    }
}