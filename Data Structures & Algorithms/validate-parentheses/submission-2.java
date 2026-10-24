

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        for (char c : s.toCharArray()) {

            // Opening bracket: push onto stack
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                // No opening bracket available to match
                if (stack.isEmpty()) {
                    return false;
                }

                // Get the most recent opening bracket
                char c1 = stack.pop();

                // Check whether its expected closing bracket matches
                if (map.get(c1) != c) {
                    return false;
                }
            }
        }

        // All opening brackets must have been matched
        return stack.isEmpty();
    }
}
