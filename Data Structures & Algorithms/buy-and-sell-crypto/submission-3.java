class Solution {
    public int maxProfit(int[] prices) {

        int buy=prices[0];
        int maxProfite=0;
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            maxProfite=Math.max( maxProfite, prices[i]-buy);
        }

        return maxProfite;
        
    }
}
