
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int left = 1;
        int right = max;

        while (left < right) {
            int k = left + (right - left) / 2;
            long hours = 0;

            for (int pile : piles) {
                hours += (pile + (long) k - 1) / k;

                if (hours > h) {
                    break;
                }
            }

            if (hours <= h) {
                right = k;
            } else {
                left = k + 1;
            }
        }

        return left;
    }
}
