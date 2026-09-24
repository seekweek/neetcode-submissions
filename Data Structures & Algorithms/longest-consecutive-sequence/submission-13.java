

class Solution {
    public int longestConsecutive(int[] arr) {
       
       if(arr.length==1 || arr.length==0){
        return arr.length;
       }
       Arrays.sort(arr);
       int Cnt=1;

       int i=1;
       while(i<arr.length){
        int ct=1;
        while(i<arr.length &&(arr[i-1]+1==arr[i] || arr[i-1]==arr[i])){
            if(arr[i-1]+1==arr[i] ){
                ct++;
            }
            i++;
        }
        Cnt=Math.max(Cnt,ct);
        i++;
       }

       return Cnt;
    }
}
