class Solution {
    public int maxArea(int[] h) {

        int ContainsMostWater=0;

        for(int i=0;i<h.length;i++){

            for(int j=i+1;j<h.length;j++){
                int dis=Math.abs(j-i);
                int min=Math.min(h[i],h[j]);
                
                int containsW=dis*min;

                ContainsMostWater=Math.max(ContainsMostWater,containsW);
            }
        }
        return ContainsMostWater;
    }
}
