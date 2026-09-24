class Solution {
    public boolean isPalindrome(String str) {

        String s=str.trim().replaceAll("\\s+","").replaceAll("\\p{Punct}","").toUpperCase();

        int left=0;

        int rigth=s.length()-1;

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
