package codingStudy;

public class LargestTriangleCluster {
  int[] parent;
  int[] size;

  public int solution(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    int total = n * m * 2;

    parent = new int[total];
    size = new int[total];
    for (int i = 0; i < total; i++) {
      parent[i] = i;
      size[i] = 1;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        int base = (i * m + j) * 2;
        int A = base, B = base + 1;

        // 자기 자신 안의 삼각형 연결
        union(A, B);

        if (grid[i][j] == -1) { // '\'
          // A: 왼쪽 아래 → (i+1, j)의 B와 연결
          if (i + 1 < n) {
            int neighborB = ((i + 1) * m + j) * 2 + 1;
            union(A, neighborB);
          }
          // B: 오른쪽 위 → (i, j+1)의 A와 연결
          if (j + 1 < m) {
            int neighborA = (i * m + (j + 1)) * 2;
            union(B, neighborA);
          }
        } else { // '/'
          // A: 왼쪽 위 → (i, j+1)의 B와 연결
          if (j + 1 < m) {
            int neighborB = (i * m + (j + 1)) * 2 + 1;
            union(A, neighborB);
          }
          // B: 오른쪽 아래 → (i+1, j)의 A와 연결
          if (i + 1 < n) {
            int neighborA = ((i + 1) * m + j) * 2;
            union(B, neighborA);
          }
        }
      }
    }

    // 가장 큰 컴포넌트 크기 반환
    int max = 0;
    for (int i = 0; i < total; i++) {
      if (parent[i] == i) {
        max = Math.max(max, size[i]);
      }
    }
    return max;
  }

  void union(int a, int b) {
    int pa = find(a), pb = find(b);
    if (pa == pb) return;

    parent[pa] = pb;
    size[pb] += size[pa];
  }

  int find(int x) {
    if (parent[x] != x) parent[x] = find(parent[x]);
    return parent[x];
  }

}
