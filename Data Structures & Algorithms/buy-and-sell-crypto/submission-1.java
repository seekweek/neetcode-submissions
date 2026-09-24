class Solution {
    public int maxProfit(int[] p) {
        
    //  ++ Sliding Window technique

    int buy=p[0];
    int maxP=0;

    for(int i=1;i<p.length;i++ ){
        if(p[i]<buy){
            buy=p[i];
        }
       
       int profit=p[i]-buy;
       maxP=Math.max(maxP,profit);

    }
  return maxP;
    }
}
