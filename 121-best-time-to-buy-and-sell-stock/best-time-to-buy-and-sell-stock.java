class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=Integer.MIN_VALUE;
        int buyprice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice=prices[i];

            }
            profit=prices[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}