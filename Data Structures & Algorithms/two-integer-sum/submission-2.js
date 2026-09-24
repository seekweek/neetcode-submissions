class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {

        let map=new Map();

         for(let e=0;e<nums.length;e++){
             
             if(map.has(target-nums[e])){
                return new Array(map.get(target-nums[e]),Number(e))
             }

            map.set(nums[e], e);
         }

         return []
    }
}
