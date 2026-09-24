class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        Arrays.sort(nums);

        int con=0;

        int cnt=1;
        for(int i=1;i<nums.length;i++){
            
            

            if(nums[i-1]+1==nums[i]){
                cnt++;
            }
            else if(nums[i-1]==nums[i]){
                  continue;
            }else{
                con=Math.max(con,cnt);
                cnt=1;
            }
        }
        con=Math.max(con,cnt);

        return con;
        
    }
}
