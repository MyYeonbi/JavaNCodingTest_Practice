package codingStudy.queue1;
import java.util.LinkedList;
import java.util.Queue;
public class BasicQueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("큐 상태: " + queue); // [10, 20, 30]
        System.out.println("제일 처음 값: " + queue.peek()); // 10
        System.out.println("제거된 값 : " + queue.remove()); //10
        System.out.println("큐 상태: " + queue); // [20, 30]

        /* remove()와 peek()는 괄호 안에 아무것도 안 넣었을때는
        FIFO원칙으로 맨 첫번째 요소가 선택되거나 제거된다.
        - 괄호 안에 특정 값을 넣으면 :
        해당 값이 큐 안에 있다면, 그 값을 제거하고 true를 반환한다.
        해당 값이 큐에 없으면 제거하지 않고 false를 반환한다.

         */

        System.out.println(queue.remove(20)); //true
        System.out.println(queue); //[30]
    }
}