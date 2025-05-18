import java.util.*;

public class PrinterQueue {
    public int solution(int[] priorities, int location) {
        // 1. 문서들을 (우선순위, 인덱스) 형태로 큐에 저장
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i}); // [우선순위, 인덱스]
        }

        int count = 0; // 출력된 문서 수를 세는 변수

        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 맨 앞 문서를 꺼냄

            // 2. 큐에 현재보다 더 높은 우선순위가 있는지 검사
            boolean hasHigherPriority = false;
            for (int[] doc : queue) {
                if (doc[0] > current[0]) { // 더 높은 우선순위가 있다면
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                // 3. 더 중요한 문서가 있으면 다시 줄 뒤로 보냄
                queue.add(current);
            } else {
                // 4. 출력 가능하면 count 증가
                count++;

                // 5. 출력한 문서가 내가 찾던 문서면 count 반환
                if (current[1] == location) {
                    return count;
                }
            }
        }

        return -1; // 이론상 절대 도달하지 않음
    }

    // 실행 코드 예시
    public static void main(String[] args) {
        PrinterQueue pq = new PrinterQueue();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int result = pq.solution(priorities, location);
        System.out.println("내 문서는 " + result + "번째에 출력됩니다.");
    }
}


