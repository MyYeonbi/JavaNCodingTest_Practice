package codingStudy.dfsBfs;

import java.util.LinkedList;
import java.util.Queue;

public class MazeSolverBfs2 {
  static int N = 4; // 미로의 크기 (4*4)

  // 미로 정보 : 1은 갈 수 있는 길, 0은 벽
  static int[][] maze = {
      {1, 0, 1, 1},
      {1, 1, 1, 0},
      {0, 0, 1, 0},
      {1, 1, 1, 1}
  };

  // 상, 우, 하, 좌 방향으로 이동하기 위한 배열
  // x: 위아래 방향 (행) y: 좌우 방향 (열)
  static int[] dx = {-1, 0, 1, 0}; // x축 이동: 위(-1), 유지(0), 아래(+1), 유지(0)
  static int[] dy = {0, 1, 0, -1}; // y축 이동: 유지(0), 오른쪽(+1), 유지(0), 왼쪽(-1)

  public boolean bfs(int startX, int startY) {

    Queue<int[]> queue = new LinkedList<>();
    boolean[][] visited = new boolean[N][N];

    queue.add(new int[]{startX, startY});
    visited[startX][startY] = true;

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int x = current[0];
      int y = current[1];

      if (x == N - 1 && y == N - 1) return true;

      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && nx < N && ny >= 0 && ny <N
        && !visited[nx][ny] && maze[nx][ny] == 1) {
          queue.offer(new int[]{nx, ny});
          visited[nx][ny] = true;
        }
      }
    }
    return false;
  }

}
