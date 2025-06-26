package codingStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class tree {
  Map<Integer, List<Integer>> graph = new HashMap<>();
  Set<Integer> visited = new HashSet<>();
  int[] nodeList;
  int[] answer = new int[2]; // [홀짝 트리 수, 역홀짝 트리 수]

  public int[] solution(int[] nodes, int[][] edges) {
    nodeList = nodes;

    // 1. 그래프 구성
    for (int n : nodes) graph.put(n, new ArrayList<>());
    for (int[] e : edges) {
      graph.get(e[0]).add(e[1]);
      graph.get(e[1]).add(e[0]);
    }

    // 2. 트리 분리 후 판단
    for (int node : nodes) {
      if (!visited.contains(node)) {
        List<Integer> tree = new ArrayList<>();
        Map<Integer, Integer> parent = new HashMap<>();
        buildTree(node, -1, tree, parent);

        // 3. 자식 수 계산
        Map<Integer, Integer> childCount = new HashMap<>();
        for (int n : tree) childCount.put(n, 0);
        for (int child : tree) {
          int p = parent.get(child);
          if (p != -1) childCount.put(p, childCount.get(p) + 1);
        }

        // 4. 노드 타입 분석
        boolean isOddEvenTree = true;
        boolean isRevOddEvenTree = true;
        for (int n : tree) {
          int children = childCount.get(n);
          if (n % 2 == 0) { // 짝수 번호
            if (children % 2 == 0) isRevOddEvenTree = false;
            else isOddEvenTree = false;
          } else { // 홀수 번호
            if (children % 2 == 0) isRevOddEvenTree = false;
            else isOddEvenTree = false;
          }
        }

        if (isOddEvenTree) answer[0]++;
        if (isRevOddEvenTree) answer[1]++;
      }
    }

    return answer;
  }

  // 트리 생성 (DFS)
  void buildTree(int current, int parent, List<Integer> tree, Map<Integer, Integer> parentMap) {
    visited.add(current);
    tree.add(current);
    parentMap.put(current, parent);

    for (int next : graph.get(current)) {
      if (!visited.contains(next)) {
        buildTree(next, current, tree, parentMap);
      }
    }
  }

}
