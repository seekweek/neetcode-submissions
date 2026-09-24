class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
//         //Step 1:
//         ArrayList<Integer>arr=new ArrayList<>();
        
//         // Step 2:
        
//         for(int i=0;i+k<=nums.length;i++){
//               ArrayList<Integer>re=new ArrayList<>();

//               for(int j=i;j<i+k;j++){
//                  re.add(nums[j]);
//               }
//               Collections.sort(re);
//                arr.add(re.get(re.size()-1));  

//         }
    
//      int goup[] =new int[arr.size()];
     
//      for(int i=0;i<arr.size();i++){
//         goup[i]=arr.get(i);
//      }
//   return goup;




        if (nums.length == 0 || k == 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove out-of-window indices
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove all elements smaller than current from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Add to result when window is full
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}

        

