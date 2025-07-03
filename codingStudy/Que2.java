package codingStudy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Que2 {public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  Queue<Integer> queue2 = new LinkedList<>();

  for(int i = 1; i <= n; i++) {
    queue.offer(i);
  }

  while(queue.size() > 1) {
    queue.poll(); // 제일 위 카드 버리기///
    queue.offer(queue.poll()); // 다음 카드를 아래로 옮기기
  }

  System.out.println(queue.peek());
}

}
