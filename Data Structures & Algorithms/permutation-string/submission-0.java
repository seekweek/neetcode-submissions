

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int len = s1.length();

        // 🔁 s1 को एक बार sort करके रखना
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sortedS1 = new String(s1Arr);

        for (int i = 0; i + len <= s2.length(); i++) {
            String s3 = "";

            for (int j = i; j < i + len; j++) {
                s3 += s2.charAt(j);
            }

            char[] ch = s3.toCharArray();
            Arrays.sort(ch);
            String sortedS3 = new String(ch); // ✅ FIX: toString() की जगह new String()

            if (sortedS3.equals(sortedS1)) {
                return true;
            }
        }

        return false;
    }
}

