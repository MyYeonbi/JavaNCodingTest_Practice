package codingStudy.stack;

import java.util.LinkedList;
import java.util.Queue;

class PrinterQueue {
  public int solution(int[] priorities, int location) {
    Queue<Document> queue = new LinkedList<>();

    // 큐 초기화
    for (int i = 0; i < priorities.length; i++) {
      queue.add(new Document(priorities[i], i));
    }

    int answer = 0;

    while (!queue.isEmpty()) {
      Document current = queue.poll();
      boolean canPrint = true;

      // 현재 문서보다 중요도가 높은 문서가 있는지 확인
      for (Document doc : queue) {
        if (doc.priority > current.priority) {
          canPrint = false;
          break;
        }
      }

      if (canPrint) {
        answer++;
        if (current.index == location) {
          return answer;
        }
      } else {
        queue.add(current);
      }
    }

    return answer;
  }

  class Document {
    int priority;
    int index;

    Document(int priority, int index) {
      this.priority = priority;
      this.index = index;
    }
  }
}
