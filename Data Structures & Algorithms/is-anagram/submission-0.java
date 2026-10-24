
class Solution {
    public boolean isAnagram(String s, String t) {
        // Different lengths cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // Count characters in s and subtract characters in t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Every character frequency must balance to zero
        for (int n : count) {
            if (n != 0) {
                return false;
            }
        }

        return true;
    }
}

