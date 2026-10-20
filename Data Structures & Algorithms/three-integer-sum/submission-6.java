class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i =0;i<nums.length-2;i++) {
            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left =i+1;
            int right = nums.length-1;
            List<Integer> x = new ArrayList<>();
            while (left<right) {
                if (nums[left] + nums[right] + nums[i] ==0) {
                 x = Arrays.asList(new Integer[]{nums[i],nums[left],nums[right]});
                  if (!x.isEmpty() && !output.contains(x)) {
            output.add(x);
            }
                 left++;
                 right--;
                 while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }

                }
                else if(nums[left] + nums[right] + nums[i] >0) {
                  right--;
                }
                else {
                    left++;
                }
            }
        }
        return output;
    }
}
