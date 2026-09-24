class Solution {
    public int largestRectangleArea(int[] h) {

        int max=0;

        for(int i=0;i<h.length;i++){
            int minH=h[i];

            int left=i;
            while(left>0 && h[left-1]>=minH){
                left--;
            }
            int rigth=i;

            while(rigth<h.length-1 && h[rigth+1]>=minH){
                rigth++;
            }

            int width=rigth-left+1;
            int area=width*minH;
            max=Math.max(area,max);
        }
        
     return max;
    }
}
