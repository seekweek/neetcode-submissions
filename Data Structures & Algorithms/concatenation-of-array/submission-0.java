class Solution {
    public int[] getConcatenation(int[] nums) {

        int re[]=new int[nums.length*2];

        int k=0;

        for(int i=0;i<nums.length;i++){
            re[k++]=nums[i];
        }
        
        for(int j=0;j<nums.length;j++){
            re[k++]=nums[j];
        }
        return re;
    }
}