package codingStudy.stack;
import java.util.Stack;

public class StackFundamental {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 1. 요소 추가
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 2. 스택 상태 확인
        System.out.println(stack);  // [1, 2, 3]

        // 3. 맨 위 요소 확인
        System.out.println("제일 꼭대기의 값 : " + stack.peek());  // 3

        // 4. 요소 제거
        System.out.println("꺼낸 값 : " + stack.pop());  // 3

        // 5. 스택이 비어있는지 확인
        System.out.println("스택이 비었는가? " + stack.isEmpty());  // false

        // 6. 스택 크기 확인
        System.out.println("스택에 저장 된 원소 수 : " + stack.size());  // 2

        // 7. 특정 요소 포함 여부 확인
        System.out.println("스택에 1 이 있는가? " + stack.contains(1));  // true
    }
}
