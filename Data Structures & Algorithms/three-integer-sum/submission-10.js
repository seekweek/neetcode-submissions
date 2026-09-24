class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    threeSum(nums) {

      nums.sort((a,b)=>a-b);

    let result=new Array();
      for(let i=0;i<nums.length-2;i++){
          
          if(i>0 && nums[i]==nums[i-1]){
            continue;
          }

          let left=i+1;
          let right=nums.length-1;

          while(left<right){
              let sum=nums[left]+nums[right];

              let arr=new Array();

              if(sum==-nums[i]){
                 arr.push(nums[i]);
                 arr.push(nums[left]);
                 arr.push(nums[right]);

                 result.push(arr);
                 left++;
                 right--;
                 while(left<nums.length && nums[left]==nums[left-1]){
                    left++;
                 }

                 while(right<nums.length && nums[right]==nums[right+1]){
                    right--;
                 }
              }
               else if(sum<-nums[i]){
                     left++;
               }else{
                right--;
               }

          }
      }

return result;
    }
}
