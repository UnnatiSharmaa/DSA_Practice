class Solution {
    public int maxProfit(int[] prices) {
            int maxprofit=Integer.MIN_VALUE;
            int buyprice=Integer.MAX_VALUE;
            for(int i=0;i<prices.length;i++){

                int profit=0;
                if(buyprice>prices[i]){
                    buyprice=prices[i];
                }
                profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            return maxprofit;
    }
}