class Solution {
    public int maxProfit(int[] p) {
        int Buy=p[0];
        int Sell=0;
        for(int i=1;i<p.length;i++){
            if(p[i] <Buy){
                Buy=p[i];
            }
            int profit=p[i]-Buy;
            Sell=Math.max(Sell,profit);
        }

        return Sell;
        
    }
}
