class Solution {
    public void rotate(int[] nums, int k) {
       
    
int end=nums.length;
        
        
        k=k%end;
        int st=0;
        Swap(nums,st,end-1);
        Swap(nums,st,k-1);
        Swap(nums,k,end-1);
        
    }

    public static void Swap(int nums[],int st,int end){
        while(st<=end){
           int t=nums[st];
           nums[st]=nums[end];
           nums[end]=t;

            st++;
            end--;
        }
    }
}