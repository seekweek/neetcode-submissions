class Solution {
    public int findMin(int[] nums) {

        int left=0;

        int right=nums.length-1;

        int min=Integer.MAX_VALUE;
         
         while(left<=right){
          
           int minE=Math.min(nums[left],nums[right]);
           min=Math.min(minE,min);
           
            left++;
            right--;
         }

         return min;


        
    }
}
