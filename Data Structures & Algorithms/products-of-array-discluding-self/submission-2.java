
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int count = 0;

        for (int n : nums) {
            if (n != 0) {
                product *= n;
            } else {
                count++;
            }
        }

        int[] result = new int[nums.length];

        // Two or more zeros means every result is zero
        if (count >= 2) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            if (count == 1) {
                result[i] = (nums[i] == 0) ? product : 0;
            } else {
                result[i] = product / nums[i];
            }
        }

        return result;
    }
}
