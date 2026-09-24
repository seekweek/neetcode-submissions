class Solution {
    public int search(int[] nums, int target) {
        

        return Binary(nums,target);
        
    }
    public static int Binary(int arr[],int tar){
        int st=0;
        int end=arr.length-1;

        while(st<=end){
            int mid=st+(end-st)/2;
               if(arr[mid]==tar){
                return mid;
               }else if(arr[mid]<tar){
                st=mid+1;
               }else{
                end=mid-1;
               }
               
        }
        return -1;
        
    }
}
