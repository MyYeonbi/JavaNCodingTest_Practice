package codingStudy.stack;

import java.util.Stack;

public class ReverseStringWithStack {
    public static String reverse(String s) {
        Stack<Character> stack = new Stack<>();

        //1. 문자열의 모든 문자를 스택에 추가
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        //2. 스택에서 문자를 하나씩 꺼내서 뒤집힌 문자열 생성
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String input = "abcd";

        /* 메서드 호출 -
        "abcd"문자열이 reverse의 매개변수로 전달된다.
        input 변수의 값 "abcd"가 reverse메서드의 파라미터 s에 복사된다.
         */
        String output = reverse(input);

        System.out.println("원래 문자열:" + input);
        System.out.println("뒤집힌 문자열: " + output);
    }
}
