package codingStudy.dfsBfs;

import java.util.*;

public class MazeSolverBfs {

  static int N = 4; // 4x4 미로
  static int[][] maze = {
      {1, 0, 1, 1},
      {1, 1, 1, 0},
      {0, 0, 1, 0},
      {1, 1, 1, 1}
  }; // 1은 이동 가능, 0은 벽

  // 이동 방향: 상, 우, 하, 좌
  static int[] dx = {-1, 0, 1, 0};
  static int[] dy = {0, 1, 0, -1};

  // 경로의 수를 저장할 변수
  static int pathCount = 0;

  public static void main(String[] args) {
    System.out.println("\nBFS로 미로 찾기:");
    String bfsResult = bfs(0, 0) ? "미로 탈출 성공" : "미로 탈출 실패";
    System.out.println(bfsResult);

    System.out.println("DFS로 미로 찾기:");
    boolean[][] visited = new boolean[N][N];
    String dfsResult = dfs(0, 0, visited) ? "미로 탈출 성공" : "미로 탈출 실패";
    System.out.println(dfsResult);

    System.out.println("\nDFS로 미로 탈출 경우의 수:");
    boolean[][] visited2 = new boolean[N][N];
    countPathsDFS(0, 0, visited2);
    System.out.println("미로 탈출 경우의 수는 : " + pathCount);
  }

  // BFS 구현
  static boolean bfs(int startX, int startY) {
    Queue<int[]> queue = new LinkedList<>();
    boolean[][] visited = new boolean[N][N];

    queue.add(new int[]{startX, startY});
    visited[startX][startY] = true;

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int x = current[0];
      int y = current[1];

      System.out.println("현재 위치: (" + x + "," + y + ")");

      if (x == N - 1 && y == N - 1) {
        System.out.println("도착!");
        return true;
      }

      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && nx < N && ny >= 0 && ny < N
            && !visited[nx][ny] && maze[nx][ny] == 1) {
          queue.offer(new int[]{nx, ny});
          visited[nx][ny] = true;
        }
      }
    }
    return false;
  }

  // DFS 구현
  static boolean dfs(int x, int y, boolean[][] visited) {
    if (x == N - 1 && y == N - 1) {
      System.out.println("도착!");
      return true;
    }

    visited[x][y] = true;

    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];

      if (nx >= 0 && nx < N && ny >= 0 && ny < N
          && !visited[nx][ny] && maze[nx][ny] == 1) {
        if (dfs(nx, ny, visited)) {
          return true;
        }
      }
    }

    return false;
  }

  // DFS로 미로 탈출 경우의 수 세기
  static void countPathsDFS(int x, int y, boolean[][] visited) {
    if (x == N - 1 && y == N - 1) {
      pathCount++;
      return;
    }

    visited[x][y] = true;

    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];

      if (nx >= 0 && nx < N && ny >= 0 && ny < N
          && !visited[nx][ny] && maze[nx][ny] == 1) {
        countPathsDFS(nx, ny, visited);
      }
    }

    visited[x][y] = false;
  }
}