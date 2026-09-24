class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let Sets=new Set();

        for(let i=0;i<nums.length;i++){
            if(Sets.has(nums[i])){
                return true;
            }
            Sets.add(nums[i]);
        }
    return false;

    }
}
