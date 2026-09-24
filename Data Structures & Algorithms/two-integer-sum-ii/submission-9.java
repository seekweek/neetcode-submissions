class Solution {
    public int[] twoSum(int[] num, int target) {
        int arr[]=new int[2];

        int left=0;

        int rigth=num.length-1;

        while(left<rigth){
           

           int sum=num[left]+num[rigth];

           if(sum==target){
            arr[0]=left+1;
            arr[1]=rigth+1;

           }
            if(sum>target){
              rigth--;
           }else{
            left++;
           }
         
        }
        return arr;
    }
}
