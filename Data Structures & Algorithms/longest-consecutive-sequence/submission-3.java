

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int lar = 1;
        Set<Integer> set = new HashSet<>();

        set.add(nums[0]);

        for (int i = 0; i < nums.length - 1; i++) {

            int diff = nums[i + 1] - nums[i];

            if (diff == 0) {
                continue;
            }

            if (diff == 1) {
                set.add(nums[i + 1]);
            } else {
                set = new HashSet<>();
                set.add(nums[i + 1]);
            }

            lar = Math.max(lar, set.size());
        }

        return lar;
    }
}