class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            // int i=0;
            // int j=0;
            // int temp[]=new int[m+n];

            // int k=0;
            // while(i<m && j<n){

            //  if(nums1[i]<nums2[j]){
            //     temp[k++]=nums1[i];
            //     i++;
            //  }else{
            //     temp[k++]=nums2[j];
            //     j++;
            //  }
            // }

            // while(i<m){
            //     temp[k++]=nums1[i++];
            // } 

            // while(j<n){
            //     temp[k++]=nums2[j];
            //     j++;
            // }

            // for(int l=0;l<temp.length;l++){
            //     nums1[l]=temp[l];
            // }

            int reSult[]=new int[m+n];

            int k=0;
            int left=0;
            int rigth=0;

            while(left<m && rigth<n){
                if(nums1[left]<nums2[rigth]){
                    reSult[k++]=nums1[left++];
                }else{
                    reSult[k++]=nums2[rigth++];
                }
            }

            while(left<m){
                reSult[k++]=nums1[left++];
            }
            while(rigth<n){
                reSult[k++]=nums2[rigth++];
            }

            for(int i=0;i<reSult.length;i++){
                nums1[i]=reSult[i];
            }
    }
}