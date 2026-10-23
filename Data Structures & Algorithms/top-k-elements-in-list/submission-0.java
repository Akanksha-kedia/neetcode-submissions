
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: Convert the unique numbers into a list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort numbers by frequency in descending order
        Collections.sort(list, (a, b) ->
            map.get(b) - map.get(a)
        );

        // Step 4: Copy the first k numbers into the answer
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

