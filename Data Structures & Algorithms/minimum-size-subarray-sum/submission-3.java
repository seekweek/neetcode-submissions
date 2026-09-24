class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        // int minCount = Integer.MAX_VALUE;

        // for(int i=0;i<nums.length;i++){
            
        //     int sum=0;
            


        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
               

        //         if(sum>=target){
        //            minCount=Math.min(j-i+1,minCount);
        //         }

        //     }
        // }
        // return minCount==Integer.MAX_VALUE?0:minCount;

        int minLength=Integer.MAX_VALUE;


        int left=0;
        int rigth=0;
        int end=nums.length-1;

        int sum=0;
        while(rigth<=end){
        
        sum+=nums[rigth];
       
        
        while(sum>=target){
            minLength=Math.min(minLength,rigth-left+1);
           sum-=nums[left];
           left++;
        }
        rigth++;
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}