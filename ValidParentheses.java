import java.util.Stack;
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        System.out.println(s1 + " is valid: " + isValid(s1));
        System.out.println(s2 + " is valid: " + isValid(s2));
        System.out.println(s3 + " is valid: " + isValid(s3));
        System.out.println(s4 + " is valid: " + isValid(s4));
        System.out.println(s5 + " is valid: " + isValid(s5));
    }
}
