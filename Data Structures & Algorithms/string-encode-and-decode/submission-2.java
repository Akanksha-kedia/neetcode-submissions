
class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str).append("#@");
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        // Empty encoded string represents an empty list
        if (str.isEmpty()) {
            return result;
        }

        String[] parts = str.split("#@", -1);

        // The final empty part comes from the trailing separator
        for (int i = 0; i < parts.length - 1; i++) {
            result.add(parts[i]);
        }

        return result;
    }
}
