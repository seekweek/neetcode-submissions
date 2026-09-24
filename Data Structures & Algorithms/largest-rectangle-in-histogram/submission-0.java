class Solution {
    public int largestRectangleArea(int[] h) {
        
           int MaxArea=0;

        for(int i=0;i<h.length;i++){
            int minH=h[i];

            int left=i;
            while(left>0 && h[left-1]>=h[i]){
                left--;
            }

            int rigth=i;
            while(rigth<h.length-1 && h[rigth+1]>=h[i]){
                rigth++;
            }
            int width=rigth-left+1;
            int area=minH*width;
            MaxArea=Math.max(MaxArea,area);
        }
        return MaxArea;
    }
}
