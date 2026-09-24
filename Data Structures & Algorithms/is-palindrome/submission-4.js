class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {

       let str="";

       for(let i=0;i<s.length;i++){
             if(/[A-Za-z]/.test(s.charAt(i))){
                str+=s.charAt(i).toLowerCase();
             }

             if(/[0-9]/.test(s.charAt(i))){
                str+=s.charAt(i);
             }
       }
       str.toLowerCase();

       let left=0;

       let right=str.length-1;

       while(left<=right){

          if(str.charAt(left)!=str.charAt(right)){
            return false;
          }

          left++;
          right--;
       }

       return true;
    }
}
