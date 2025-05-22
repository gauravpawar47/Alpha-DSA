package Programs.Chapter_8;

public class Ch8_Assignment_3
{
    public static int buyAndSellStock(int prices[])
    {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            else
                buyPrice = prices[i];
            System.out.println(buyPrice +","+ maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args)
    {
        // Q. You are given an array prices where prices[i] is the price of a given stock on the ith day. Return the
        // maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(buyAndSellStock(prices));
    }
}