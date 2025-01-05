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
    }
}
