package codingStudy.dfsBfs;

import java.util.*;

public class MazeSolverBfs1 {
static int N = 4; // 미로의 크기 (4*4)

  //미로 정로 : 1은 갈 수 있는 길, 0은 벽(못 가는 곳)
  static int [][] maze = {
      {1, 0, 1, 1},
      {1, 1, 1, 0},
      {0, 0, 1, 0},
      {1, 1, 1, 1}
  };

  // 상, 우, 하, 좌 방향으로 이동하기 위한 배열
  // x : 위아래 방향(행) y: 좌우 방향(열)
  static int[] dx = {-1, 0, 1, 0}; // x축 이동 : 위(-1), 유지(0), 아래(+1), 유지(0)
  static int[] dy = {0, -1, 1, 0}; // y축 이동 : 유지(0), 오른쪽(+1), 유지(0), 왼쪽(-1)

  // DFS로 경로 수를 셀 때 사용
  static int pathCount = 0;



  public static void main(String[] args) {
    System.out.println("\nBFS Maze");
    String bfsResult = bfs(0,0) ? "미로 탈출 성공" : "미로 탈출 실패";
    System.out.println(bfsResult);
  }

  //bfs 너비우선탐색 : 가까운 칸부터 차례로 살펴보기
  static boolean bfs(int starX, int starY) {
    Queue<int[]> queue = new LinkedList<>(); // 방문할 좌표를 저장할 줄(Queue)
    boolean[][] visited = new boolean[N][N]; // 방문 여부 체크 배열

    queue.add(new int[]{starX, starY}); //시작점 추가
    visited[starX][starY] = true; //시작점을 방문 처리

    while (!queue.isEmpty()) {
      int[] current = queue.poll(); // 줄에서 꺼낸 현재 위치
      int x = current[0];
      int y = current[1];
      System.out.println("현재 위치: (" + x +"," + y +")");

      //도착점에 도달했는지 확인
      if (x == N - 1 && y == N - 1) {
        System.out.println("도착!");
        return true;
      }

      // 네 방향을 차례대로 살펴봄
      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        // 다음 위치가 미로 안에 있고, 벽이 아니며, 아직 방문하지 않은 곳이라면
        if (nx >=0 && nx < N && ny >=0 && ny < N
            && !visited[nx][ny] && maze[nx][ny] == 1) {
          queue.offer(new int[]{nx, ny}); // 다음 위치를 줄에 넣음
          visited[nx][ny] = true; // 방문 처리
        }
      }
    }
    return false; // 도착하지 못했을 경우. 
  }


}
