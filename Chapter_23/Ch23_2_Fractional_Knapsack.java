package Programs.Chapter_23;
import java.util.Arrays;
import java.util.Comparator;

public class Ch23_2_Fractional_Knapsack
{
    public static void main(String[] args)
    {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int W = 50;

        double ratio[][] = new double[value.length][2];
        // 0 Col = Original Index
        // 1 Col = Ratio

        for(int i = 0; i < value.length; i++)
        {
            ratio[i][0] = i; // Index
            ratio[i][1] = value[i] / (double) weight[i]; // Ratio
        }

        // Ascending Order Sorting for ratios
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalValue = 0;

        // Descending Order Traversing for Higher ratio
        for(int i = ratio.length - 1; i >= 0; i--)
        {
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx])
            {
                // Included Full
                finalValue += value[idx];
                capacity -= weight[idx];
            }
            else
            {
                // Included Fractional
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final Value : "+ finalValue);
    }
}