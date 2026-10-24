
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



class Solution1 {

    public String encode1(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            // Store the length, then a delimiter, then the string
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode1(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {

            // Find the delimiter after the length
            int delimiter = str.indexOf("#", i);

            // Convert the length prefix into an integer
            int length = Integer.parseInt(
                str.substring(i, delimiter)
            );

            // Start of the actual string
            int start = delimiter + 1;

            // Read exactly 'length' characters
            int end = start + length;

            result.add(str.substring(start, end));

            // Move to the beginning of the next encoded string
            i = end;
        }

        return result;
    }
}

}
