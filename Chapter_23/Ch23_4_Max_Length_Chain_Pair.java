package Programs.Chapter_23;
import java.util.Arrays;
import java.util.Comparator;

public class Ch23_4_Max_Length_Chain_Pair
{
    public static int maxChainPair(int[][] pairs)
    {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chainLength = 1;
        int chainEnd = pairs[0][1]; // Last Selected End Pair

        for(int i = 1; i < pairs.length; i++)
        {
            if(pairs[i][0] > chainEnd)
            {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }

        return chainLength;
    }

    public static void main(String[] args)
    {
        int[][] pairs = {{5, 24},
                         {39, 60},
                         {5, 28},
                         {27, 40},
                         {50, 90}};

        System.out.println("Maximum Length Chain Pair : "+ maxChainPair(pairs));
    }
}