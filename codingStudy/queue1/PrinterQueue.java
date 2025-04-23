package codingStudy.queue1;
import java.util.*;
public class PrinterQueue {

  public int solution(int[] priorities, int location) {
    //1. 큐 초기화
    Queue<int[]> queue = new LinkedList<>();
    for (int i =0; i <priorities.length; i++) {
      queue.add(new int[] {priorities[i],i});
    }

    int count = 0; //출력 순서

    while (!queue.isEmpty()) {
      int[] current = queue.poll();

      // 2. 큐에 남아 있는 문서들 중 현재 우선순위보다 높은 문서가 있는지 확인
      boolean hasHigherPriority = false;
      for (int[] doc : queue) {
        if(doc[0] > current[0]) {
          hasHigherPriority= true;
          break;
        }
      }

      //3. 현재 문서를 다시 큐에 넣을지, 아니면 출력할지 결정
      if (hasHigherPriority) {
        // 더 높은 우선순위가 있으므로 뒤로 보냄
        queue.add(current);
      } else {
        // 현재  문서를 출력
        count++;

        // 만약 현재 문서가 목표 문서라면 그때의 count를 반환
        if (current[1] == location) {
          return count;
        }
      }
    }
    return -1;
  }
// 실행코드
  public static void main (String[] args) {
    PrinterQueue printerQueue = new PrinterQueue();
    int[] priorities = {1,2,3,4,5};
    int location = 2;
    int result = printerQueue.solution(priorities, location);

    System.out.println("result = " + result);
  }
}
