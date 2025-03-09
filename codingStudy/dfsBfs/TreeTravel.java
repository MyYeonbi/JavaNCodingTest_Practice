package codingStudy.dfsBfs;

import java.util.*;

public class TreeTravel {
    // BFS 구현 (큐를 사용)
    /* BFS는 큐를 사용해서 너비 우선 탐색을 수행.*/
    public static void bfs(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            /*큐를 사용해서 가까운 노드부터 탐색.
            * poll을 사용하여ㅕ 가장 먼저 들어온 노드를 방문한 후,
            * 해당 노드의 모든 자식 노드를 큐에 추가.
            * 큐가 빌 때까지 반복. */
            Node current = queue.poll(); // 큐에서 노드 꺼내기
            // 현재 노드 방문
            System.out.print(current.data + " "); // 방문한 노드 출력

            // 모든 자식 노드를 큐에 추가
            for (Node child : current.children) {
                queue.add(child);
            }
        }
    }

    // DFS 구현 (재귀적 방법)
    public static void dfs(Node root) {
        /*DFS 동작 방식 :
        * 재귀를 이용하여 깊이 우선 탐색.
        * 현재 노드를 방문한 후, 자식 노드들을 재귀적으로 방문.
        * 먼저 추가된 자식부터 깊이 탐색 -> 한 방향으로 끝까지 내려갔다가 다시 돌아옴.*/
        if (root == null) return;

        // 현재 노드 방문
        System.out.print(root.data + " "); //현재 노드 방문

        // 모든 자식 노드에 대해 재귀적으로 DFS 수행
        for (Node child : root.children) {
            dfs(child);
        }
    }

    public static void main(String[] args) {
        // 트리 생성
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);

        // 트리 구조 구성
        root.addChild(node2);
        root.addChild(node3);

        node2.addChild(node4);
        node2.addChild(node5);

        node3.addChild(node6);
        node3.addChild(node7);

        node4.addChild(node8);
        node4.addChild(node9);

        node5.addChild(node10);
        node5.addChild(node11);

        /*
        생성된 트리 구조:
                 1
              /     \
             2        3
           /   \    /   \
          4     5  6     7
         / \   / \
        8   9 10  11

        예상 출력:
        DFS: 1-2-4-8-9-5-10-11-3-6-7
        BFS: 1-2-3-4-5-6-7-8-9-10-11
        */

        // DFS 수행
        System.out.println("DFS 순회 결과:");
        dfs(root);
        System.out.println();

        // BFS 수행
        System.out.println("BFS 순회 결과:");
        bfs(root);
        System.out.println();
    }
}









