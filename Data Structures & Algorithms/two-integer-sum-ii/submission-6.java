class Solution {
    public int[] twoSum(int[] num, int target) {
    //    int left=0;
    //    int rigth=num.length-1;
    //    int arr[]=new int[2];
       
    //    while(left<=rigth){
       
    //    int current=num[left]+num[rigth];

    //    if(current==target){
    //        arr[0]=left+1;
    //        arr[1]=rigth+1;
    //        return arr;
    //    }
    //    else if(current<target){
    //     left++;
    //    }else{
    //     rigth--;
    //    }
    //    }
    //    return arr;
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++
 int re[]=new int[2];
 int left=0;
 int rigth=num.length-1;

 while(left<=rigth){
    int sum=num[left]+num[rigth];
    if(sum==target){
        re[0]=left+1;
        re[1]=rigth+1;

        return re;
    }
    else if(sum>target){
        rigth--;
    }else{
        left++;
    }
 }

return re;
     }
}
