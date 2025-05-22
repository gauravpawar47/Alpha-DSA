package Programs.Chapter_23;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ch23_5_Indian_Coins
{
    public static int minCoins(Integer[] coins, int amount)
    {
        int count = 0;
        Arrays.sort(coins, Comparator.reverseOrder());
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < coins.length; i++)
        {
            if(coins[i] <= amount)
            {
                while(coins[i] <= amount)
                {
                    count++;
                    result.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Answer : "+ result);
        return count;
    }

    public static void main(String[] args)
    {
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount = 3857;

        System.out.println("Total Minimum Coins Required for "+ amount +" is : "+ minCoins(coins, amount));
    }
}