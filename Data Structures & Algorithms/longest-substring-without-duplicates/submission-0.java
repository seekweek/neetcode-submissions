class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        String str = "";
        int l = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!set.contains(ch)) {
                str += ch;
                set.add(ch);
            } else {
                l = Math.max(l, str.length());
                
                // Shift str and set to remove characters from start till repetition
                int idx = str.indexOf(ch);
                str = str.substring(idx + 1) + ch;

                // Rebuild the set based on updated str
                set.clear();
                for (char c : str.toCharArray()) {
                    set.add(c);
                }
            }
        }

        // Final check for last substring
        l = Math.max(l, str.length());

        return l;
    }
}
