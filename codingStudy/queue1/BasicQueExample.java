package codingStudy.queue1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.LinkedHashMap;
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

        /* peek() 메서드의 동작:
        - 괄호 안에 아무것도 넣지 않으면 큐의 맨 앞 요소를 반환한다.
        단 이때 큐에서 값을 제거하지 않는다.
        큐가 비어있다면 null을 반환한다.

        peek()은 괄호 안에 값을 넣을 수 없다.
         */
        queue.add(40);
        queue.add(50);
        System.out.println(queue); //[30, 40, 50]

        System.out.println(queue.peek()); //30
        System.out.println(queue);//[30, 40, 50]

        // 예제2 : 큐가 비었을때 연산
        System.out.println("큐가 비었는가? " + queue.isEmpty()); //false
        try {
            queue.remove(); // 큐가 비어 있으면 예외 발생
        } catch (Exception e) {
            System.out.println("예외 발생 : 큐가 비어 있습니다. ");
        }

        /* poll()이란 큐의 맨 앞 요소를 제거하고 반환하는 메서드이다.
        큐가 비어 있을 경우, null을 반환한다.
        remove()와 유사하지만 , 큐가 비었을때 동작이 다르다.
        poll은 null 반환. remove는 NoSuchElementException 발생.
         */

        // 예제 3: 특정 데이터 포함 여부 확인
        Queue<String> queue1 = new LinkedList<>();
        queue1.add("apple");
        queue1.add("banana");
        queue1.add("orange");

        System.out.println("큐 상태:" + queue1);
        System.out.println("큐에 'banana'가 있는가?" + queue1.contains("banana"));
        System.out.println("큐에 'grape'가 있는가?" + queue1.contains("grape"));

        // 자주 나오는 예제 : BFS 너비 우선 탐색
        int[][] graph = {
                {1, 2}, // 0번 노드와 연결된 노드들
                {0, 3, 4}, // 1번 노드
                {0, 5, 6}, // 2번 노드
                {1},       // 3번 노드
                {1},       // 4번 노드
                {2},       // 5번 노드
                {2}        // 6번 노드
        };

        boolean[] visited = new boolean[7];
        Queue<Integer> queue0 = new LinkedList<>();

        int startNode = 0; // 시작 노드
        queue0.add(startNode);
        visited[startNode] = true;

        System.out.println("BFS 탐색 순서:");
        while (!queue0.isEmpty()) {
            int current = queue0.remove();
            System.out.print(current + " ");

            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    queue0.add(neighbor);
                    visited[neighbor] = true;
                }
            }

        }

        // 꼭 알아야 할 예제: 캐시 구현 (LRU 알고리즘)
         class LRUCache<K, V> extends LinkedHashMap<K, V> {
            private final int capacity;

            public LRUCache(int capacity) {
                super(capacity, 0.75f, true);
                this.capacity = capacity;
            }

            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }

            public static void main(String[] args) {
                LRUCache<Integer, String> cache = new LRUCache<>(3);

                cache.put(1, "A");
                cache.put(2, "B");
                cache.put(3, "C");
                System.out.println(cache); // {1=A, 2=B, 3=C}

                cache.get(1); // 1 사용
                cache.put(4, "D"); // 가장 오래된 2 제거
                System.out.println(cache); // {3=C, 1=A, 4=D}
            }
        }
    }
}
