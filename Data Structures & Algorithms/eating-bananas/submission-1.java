class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = getMax(piles); // Max possible k

        for (int speed = 1; speed <= max; speed++) {
            int hours = getHours(piles, speed);

            if (hours <= h) {
                return speed; // First k that works
            }
        }

        return max; // If no smaller k works, return max
    }

    private int getMax(int[] piles) {
        int max = piles[0];
        for (int pile : piles) {
            if (pile > max) max = pile;
        }
        return max;
    }

    private int getHours(int[] piles, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / k);
        }
        return hours;
    }
}
