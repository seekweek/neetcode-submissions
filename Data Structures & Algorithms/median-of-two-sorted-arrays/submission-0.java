class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        

        
        
        int len=nums1.length+nums2.length;

        int arr[]=new int[len];
        int k=0;
        for(int e:nums1){
          arr[k++]=e;
        }

        for(int e:nums2){
            arr[k++]=e;
        }

        Arrays.sort(arr);
        int EvenOdd=arr.length;
        double res=0;

        if(EvenOdd%2==0){
            
            int mid=arr.length/2;
            res=(arr[mid]+arr[mid-1])/2.0;
            

        }else{
           int mid=arr.length/2;
           res=arr[mid];

        }
      return res;
  
    }
}
