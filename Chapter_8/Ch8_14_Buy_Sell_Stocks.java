package Programs.Chapter_8;

public class Ch8_14_Buy_Sell_Stocks
{
    public static int buyAndSellStocks(int prices[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else
                buyPrice = prices[i];
            System.out.println(buyPrice +","+ maxProfit);
        }

        return maxProfit;
    }

    public static void main(String []args)
    {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(buyAndSellStocks(prices));
    }
}