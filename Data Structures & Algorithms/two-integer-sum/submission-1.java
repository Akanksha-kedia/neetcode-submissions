class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] index = new int[2];
        for(int i=0; i<nums.length;i++) {
        int j = target-nums[i];
        if(map.containsKey(j)) {
         index[0] = map.get(j);
         index[1] = i;
        } else {
        map.put(nums[i], i);
        }
        }
        // Arrays.sort(nums);
        // int[] index = new int[2];
        // int left =0; int right = nums.length-1;
        // while(left<right) {
        //     if (nums[left] + nums[right] == target) {
        //         index[0] = left;
        //         index[1] = right;
        //         return index;
        //     }
        //     else if (nums[left] + nums[right] >target) {
        //         right--;
        //     }
        //     else {
        //         left++;
        //     }
        // }

        return index;
    }
}
