package codingSelfStudy.bfs;
import java.util.*;

class TargetNumberBFS {
  public int solution(int[] numbers, int target) {
    int answer = 0;
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{0, 0}); // (현재 합, 인덱스)

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int sum = current[0];
      int index = current[1];

      if (index == numbers.length) { // 모든 숫자를 사용한 경우
        if (sum == target) answer++;
      } else {
        queue.add(new int[]{sum - numbers[index], index + 1});
      }
    }

    return answer;
  }
}