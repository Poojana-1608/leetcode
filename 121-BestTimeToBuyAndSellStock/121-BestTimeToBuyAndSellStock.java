// Last updated: 8/11/2026, 11:35:36 AM
class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice =prices[i];
            }else{
                int profit=prices[i]-minprice;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
        }return maxprofit;
        
    }
}