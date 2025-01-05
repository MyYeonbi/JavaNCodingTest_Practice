package codingStudy.stack;
import java.util.Stack;
public class StackAssignment1 {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if ( c == '(') {
                // 열린 괄호는 스택에 추가
                stack.push(c);
            } else if ( c == ')') {
                // 닫힌 괄호를 만났을때
                if (stack.isEmpty()) {
                    // 매칭될 열린 괄호가 없으면 닫힌 괄호가 남으니깐 false 반환
                    return false;
                }
                stack.pop(); // 매칭되는 열린 괄호 제거
            }
        }
        // 모든 문자열 순회 후 스택이 비어 있으면 true , 아니면 false
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String tc1 = "()()"; // true
        String tc2 = "()()("; // false
        String tc3 = "())"; // false
        String tc4 = "((((((()))()()))))()()())(())))"; // false

        System.out.println(solution(tc1)); // true
        System.out.println(solution(tc2)); // false
        System.out.println(solution(tc3)); // false
        System.out.println(solution(tc4)); // false
    }
}
