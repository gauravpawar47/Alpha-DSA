package Programs.Chapter_23;
import java.util.Arrays;

public class Ch23_3_Min_Absolute_Difference
{
    public static int minDifference(int[] A, int[] B)
    {
        int minDiff = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++)
        {
            minDiff += Math.abs(A[i] - B[i]);
        }

        return minDiff;
    }

    public static void main(String[] args)
    {
        int[] A = {4, 1, 8, 7};
        int[] B = {2, 3, 6, 5};

        int minDiff = minDifference(A, B);
        System.out.println("Minimum Absolute Difference : "+ minDiff);
    }
}