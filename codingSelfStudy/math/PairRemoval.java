package codingSelfStudy.math;

import java.util.Stack;

class PairRemoval {
  public int solution(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (!stack.isEmpty() && stack.peek() == c) {
        stack.pop(); // 짝지어 제거
      } else {
        stack.push(c); // 스택에 추가
      }
    }

    // 스택이 비어 있으면 1, 아니면 0 반환
    return stack.isEmpty() ? 1 : 0;
  }
}