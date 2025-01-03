package codingStudy.stack;
import java.util.Stack;

public class StackExample1 {public static String solution(String s) {
    Stack<Character> stack = new Stack<>();
    String reverseStr = "";

    // 문자열의 각 문자를 Stack에 push
    for (char c: s.toCharArray()) {
        stack.push(c);
    }

    // Stack에서 pop하면서 reverseStr에 추가
    while (!stack.isEmpty()) {
        reverseStr += stack.pop();
    }

    return reverseStr;
}

    public static void main(String[] args) {
        String tc1 = "가나다";
        String tc2 = "김연비";
        String tc3 = "김시완";
        String tc4 = "김수민";

        System.out.println(solution(tc1));
        System.out.println(solution(tc2));
        System.out.println(solution(tc3));
        System.out.println(solution(tc4));
    }
}
