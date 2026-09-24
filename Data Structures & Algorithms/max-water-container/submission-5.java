class Solution {
    public int maxArea(int[] h) {

        int max=0;

        int left=0;
        int right=h.length-1;

        while(left<=right){

            int dis=right-left;

            int minV=Math.min( h[left], h[right]);
           
           max=Math.max(max,dis*minV);

            if(h[left]<h[right]){
                left++;
            }else{
                right--;
            }

        }
        return max;
    }
}
