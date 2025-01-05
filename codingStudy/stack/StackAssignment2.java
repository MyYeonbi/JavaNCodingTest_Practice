package codingStudy.stack;
import java.util.Stack;

public class StackAssignment2 {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        //1. 문자열의 모든 문자를 스택에 추가
        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        //2. 스택에서 문자를 하나씩 꺼내며 원래 문자열과 비교
        for (char c: s.toCharArray()) {
            if (stack.pop() != c) {
                // 스택에서 꺼낸 문자와 원래 문자열이 다르면
                return false;
            }
        }

        //3. 모든 문자가 일치하면 회문
        return true;
    }
    public static void main(String[] args) {
        String tc1 = "level";  // true
        String tc2 = "우영우";  // true
        String tc3 = "역삼역";  // true
        String tc4 = "오렌지";  // false

        System.out.println(solution(tc1)); // true
        System.out.println(solution(tc2)); // true
        System.out.println(solution(tc3)); // true
        System.out.println(solution(tc4)); // false
    }
}
