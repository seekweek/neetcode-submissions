class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
     if(nums.length===0){
        return 0;
     }
nums.sort((a,b)=>{
           return a-b;
        });

        let set =new Set();

        for(let e of nums){
            set.add(e);
        }

        let arr1=[];

        for(let e of set){
            arr1.push(e);
        }

        console.log(arr1);

        let i=0;
        let j=1;
        let Cnt=1;
        let maxs=1;
        while(j<arr1.length  ){
              
            if(arr1[i]+1===arr1[j]){
                Cnt++;
                i++;
            }else{

                maxs=Math.max(Cnt,maxs)
                Cnt=1;
                i=j;
                
            }

              j++;

        }
     maxs=Math.max(maxs, Cnt);
           return maxs;
    }
}
