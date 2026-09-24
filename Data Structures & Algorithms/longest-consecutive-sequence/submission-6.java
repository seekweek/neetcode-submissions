

class Solution {
    public int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return 1;

        Arrays.sort(arr);
        int Cnt = 1; // final answer
        int i = 1;

        while (i < arr.length) {
            int ct = 1;

            // handle consecutive and duplicate elements
            while (i < arr.length && (arr[i] == arr[i - 1] || arr[i] == arr[i - 1] + 1)) {
                if (arr[i] == arr[i - 1] + 1) {
                    ct++;
                }
                i++;
            }

            Cnt = Math.max(Cnt, ct);
            i++; // go to next new sequence start
        }

        return Cnt;
    }
}
