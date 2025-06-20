package codingStudy;

import java.util.LinkedList;
import java.util.Queue;



class GridFlipMazeSolver {
  static int n, m, k;
  static int[][] visible, hidden;
  static int maxScore = Integer.MIN_VALUE;

  public int solution(int[][] visible, int[][] hidden, int k) {
    GridFlipMazeSolver.visible = visible;
    GridFlipMazeSolver.hidden = hidden;
    GridFlipMazeSolver.k = k;
    n = visible.length;
    m = visible[0].length;

    // 모든 행 뒤집기 조합
    for (int rowMask = 0; rowMask < (1 << n); rowMask++) {
      for (int colMask = 0; colMask < (1 << m); colMask++) {
        int cost = (Integer.bitCount(rowMask) + Integer.bitCount(colMask)) * k;
        int[][] board = buildBoard(rowMask, colMask);
        int pathScore = bfs(board);
        if (pathScore != -1) {
          maxScore = Math.max(maxScore, pathScore - cost);
        }
      }
    }

    return maxScore;
  }

  private int[][] buildBoard(int rowMask, int colMask) {
    int[][] board = new int[n][m];
    for (int i = 0; i < n; i++) {
      boolean flipRow = ((rowMask >> i) & 1) == 1;
      for (int j = 0; j < m; j++) {
        boolean flipCol = ((colMask >> j) & 1) == 1;
        // flip이 홀수 번이면 뒤집힌 값 사용
        boolean isFlipped = flipRow ^ flipCol;
        board[i][j] = isFlipped ? hidden[i][j] : visible[i][j];
      }
    }
    return board;
  }

  private int bfs(int[][] board) {
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    boolean[][] visited = new boolean[n][m];
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{0, 0, board[0][0]});
    visited[0][0] = true;

    while (!queue.isEmpty()) {
      int[] cur = queue.poll();
      int y = cur[0], x = cur[1], sum = cur[2];

      if (y == n-1 && x == m-1) {
        return sum;
      }

      for (int[] d : dir) {
        int ny = y + d[0];
        int nx = x + d[1];

        if (0 <= ny && ny < n && 0 <= nx && nx < m && !visited[ny][nx]) {
          visited[ny][nx] = true;
          queue.offer(new int[]{ny, nx, sum + board[ny][nx]});
        }
      }
    }
    return -1;
  }
}
