package codingSelfStudy.stack;

import java.util.Stack;
//Stack은 LIFO (나중에 들어온게 제일 먼저 나온다.)

public class ValidParenthesesChecker {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        //stack 변수를 선언하고 새로운 객체를 생성하면서, 괄호를 저장하는 스택 자료구조.

        for (char ch : s.toCharArray()) {
            // s를 문자 배열로 변환하고,이를 ch라는 문자로 하나씩 순회.
            if (ch == '(') {
                stack.push(ch);
                // 만약에 열린 괄호라면 닫히는 괄호가 올 때까지 대기해야 하므로 스택에 저장.
                // stack.push(ch)는 현재 문자를 스택에 추가.
            } else {
                // 현재 문자가 닫힌 괄호라면 열린 괄호와 짝을 이루는지 확인해야 한다.
                if (stack.isEmpty()) {
                    return false;
                    // 닫힌 괄호가 나왔을때 짝을 맞출 열린 괄호가 없으면 잘못된 괄호 배열이라 false 리턴.
                }
                stack.pop();
                // 닫힌 괄호가 등장했을 때, 스택에서 마지막으로 들어간 열린 괄호를 제거한다.괄호가 올바르게 쌍을 이루었음을 의미.
                // stack.pop()은 스택의 최상위 요소를 제거.

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesesChecker validParenthesesChecker = new ValidParenthesesChecker();
        System.out.println(validParenthesesChecker.solution("(()))"));
    }

}
