class Solution {
    public boolean validPalindrome(String s) {
     
       int left=0;
       int rigth=s.length()-1;

       while(left<=rigth){
       
        if(s.charAt(left)!=s.charAt(rigth)){
              return isPalindrom(s,left+1,rigth) || isPalindrom(s,left,rigth-1);
        }

        left++;
        rigth--;
       }  
   return true;
    }

    public static boolean isPalindrom(String s,int left,int rigth){
        while(left<=rigth){

            if(s.charAt(left)!=s.charAt(rigth)){
                return false;
            }
            left++;
            rigth--;
        }

        return true;
    }

    }
