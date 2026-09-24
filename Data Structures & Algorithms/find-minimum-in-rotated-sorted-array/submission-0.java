class Solution {
    public int findMin(int[] nums) {
        int Min=Integer.MAX_VALUE;

      int  left=0;
      int rigth=nums.length-1;

      while(left<=rigth){

         int min=Math.min(nums[left],nums[rigth]);
        Min=Math.min(Min,min);
        left++;
        rigth--;

      }
      return Min;
    }
}
