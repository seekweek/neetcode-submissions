class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {

        if(nums.length===0 || nums.length===1){
            return false;
        }

           let set=new Set();

           for(let e of nums){
               if(! set.has(e)){
                  set.add(e);
               }else{
               return true;
               }
           }

           return false;



    }
}
