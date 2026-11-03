class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;

        int[] freq = new int[128];
        int max = 0;

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            while (freq[c] > 0) {
                char removed = sb.charAt(0);
                freq[removed]--;
                sb.deleteCharAt(0);
            }

            sb.append(c);
            freq[c]++;

            max = Math.max(max, sb.length());
        }

        return max;
    }
}