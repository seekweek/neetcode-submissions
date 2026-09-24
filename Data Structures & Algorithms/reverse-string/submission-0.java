class Solution {
    public void reverseString(char[] s) {

        // it is called a two pointer algorithm approach

        int left=0;
        int right=s.length-1;

        while(left<=right){
        char c=s[left];
        s[left]=s[right];
         s[right]=c;
          
            left++;
            right--;
        }
        
    }
}