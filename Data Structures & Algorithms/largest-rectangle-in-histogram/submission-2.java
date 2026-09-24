class Solution {
    public int largestRectangleArea(int[] h) {

        int maxHisto=0;

        for(int i=0;i<h.length;i++){
           int minH=h[i];

           int left=i;

           while(left>0 && h[left-1]>=minH){
            left--;
           }

           int right=i;
           while(right<h.length-1 && h[right+1]>=minH){
            right++;
           }

           int dis=right-left+1;
           int area=dis*minH;

           maxHisto=Math.max(maxHisto,area);
        }
     return maxHisto;   
    }
}
