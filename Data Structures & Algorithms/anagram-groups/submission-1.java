


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String st : strs) {
            char[] ch = st.toCharArray();
            Arrays.sort(ch);

            String newString = new String(ch);

            if (!map.containsKey(newString)) {
                map.put(newString, new ArrayList<>());
            }

            map.get(newString).add(st);
        }

        return new ArrayList<>(map.values());
    }
}
