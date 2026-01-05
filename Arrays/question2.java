package Arrays;

public class question4 {
    public static int maxProfit(int[] prices){
        int n = prices.length;
        int maxProfit = 0;
        int buyPrice = prices[0];

        for(int i=1;i<n;i++){
            int currProfit = prices[i] - buyPrice;
            if(currProfit > maxProfit){
                maxProfit = currProfit;
            }
            if(prices[i]<buyPrice){
                buyPrice =prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
