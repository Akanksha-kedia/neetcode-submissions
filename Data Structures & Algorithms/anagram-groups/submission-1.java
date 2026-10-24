

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Convert string to character array
            char[] ch = s.toCharArray();

            // Sort characters to get a common key
            Arrays.sort(ch);
            String key = new String(ch);

            // Create a list if this key is seen for the first time
            map.putIfAbsent(key, new ArrayList<>());

            // Add the original string to its group
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

