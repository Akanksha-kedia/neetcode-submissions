class Solution {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        StringBuilder sb = new StringBuilder();

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            sb.append(c);

            freq[c - 'A']++;

            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            while (sb.length() - maxFreq > k) {

                char removed = sb.charAt(0);

                freq[removed - 'A']--;

                sb.deleteCharAt(0);
                left++;
            }

            maxLength = Math.max(maxLength, sb.length());
        }

        return maxLength;
    }
}