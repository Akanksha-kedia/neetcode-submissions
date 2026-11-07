

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String c : tokens) {

            if (!c.equals("+") && !c.equals("-") &&
                !c.equals("*") && !c.equals("/")) {

                stack.push(Integer.parseInt(c));

            } else {

                int right = stack.pop();
                int left = stack.pop();

                switch (c) {
                    case "+":
                        stack.push(left + right);
                        break;

                    case "-":
                        stack.push(left - right);
                        break;

                    case "*":
                        stack.push(left * right);
                        break;

                    case "/":
                        stack.push(left / right);
                        break;
                }
            }
        }

        return stack.pop();
    }
}