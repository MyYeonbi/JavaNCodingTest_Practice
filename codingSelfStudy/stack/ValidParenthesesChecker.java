package codingSelfStudy.stack;

import java.util.Stack;
//Stack은 LIFO (나중에 들어온게 제일 먼저 나온다.)

public class ValidParenthesesChecker {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        //stack 변수를 선언하고 새로운 객체를 생성하면서, 괄호를 저장하는 스택 자료구조.

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
