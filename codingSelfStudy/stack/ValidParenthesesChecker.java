package codingSelfStudy.stack;

import java.util.Stack;

public class ValidParenthesesChecker {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesesChecker validParenthesesChecker = new ValidParenthesesChecker();
        System.out.println(validParenthesesChecker.solution("(()))"));
    }

}
