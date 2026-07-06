class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit=0;
       int buyprice=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
        if(prices[i]<buyprice){
            buyprice=prices[i];
        }
        int profit=prices[i]-buyprice;
        
        maxprofit=Math.max(maxprofit,profit);


       }
       return maxprofit;
    }
}