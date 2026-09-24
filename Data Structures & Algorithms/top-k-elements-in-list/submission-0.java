

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert map to list
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());

        // Step 3: Sort the list by frequency (descending)
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        // Step 4: Extract top k keys
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
