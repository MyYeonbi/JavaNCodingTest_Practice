package codingStudy.dfsBfs.bfs;
/* 문제 : 정수 행렬에서 안전 영역 찾기
*  문제 설명 :
* N*N 크기의 정수 행렬이 있다. 각 칸에는 그 지점의 높이가 적혀 있다.
* 비가 내려 특정 높이 이하의 모든 지점이 물에 잠긴다고 가정할 때, 물에 잠기지 않는 안전한 영역의 개수를 구하는 프로그램을 작성하라.
*
* 안전한 영역이란 물에 잠기지 않은 지점들이 상하좌우로 연결된 영역을 의미한다.
*
* 입력:
* - 첫 번째 줄에 행렬의 크기 N이 주어진다.
* - 다음 N개 줄에는 각 지점의 높이가 주어진다.
*
* 출력:
* 물에 잠기는 높이별로 안전한 영역의 최대 개수를 출력한다.
*
* */

import java.util.*;

public class SafeZone {

  //1. 방향 배열 설정 . 상,우,하,좌
  static int[]  dx = {-1, 0, 1, 0};
  static int[] dy = {0, 1, 0, -1};
  static int N;
  static int[][] map;
  static boolean[][] visited;

  //2. BFS 메인 로직 - 이 문제의 핵심은 "각 높이별로" 안전 영역을 찾아야 한다는 점이다.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();

    // 지도 초기화
    map = new int[N][N];
    int maxHeight = 0; // 최대 높이

    // 지도 정보 입력 받기
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++){
        map[i][j] = sc.nextInt();
        maxHeight = Math.max(maxHeight, map[i][j]);
      }
    }

    int maxSafeZones = 0; //최대 안전 영역 개수

    // 모든 가능한 물의 높이에 대해 안전 영역 수 계산
    // 높이가 0인 경우도 포함 (비가 안 올 수도 있음)
    for (int height = 0; height <= maxHeight; height++) {
      visited = new boolean[N][N]; // 방문 배열 초기화
      int safeZones = 0; // 현재 높이에서의 안전 영역 수

      // 모든 지점에 대해 BFS 수행
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          // 방문하지 않았고, 물에 잠기지 않은 지점이라면 BFS 시작
          if (!visited[i][j] && map[i][j] >height) {
            bfs(i, j, height);
            safeZones++;

          }
        }
      }

      //최대 안전 영역 수 갱신
      maxSafeZones = Math.max(maxSafeZones, safeZones);
    }

    System.out.println(maxSafeZones);

  }

  // 3. BFS로 하나의 안전 영역 탐색
  static void bfs(int startX, int startY, int height) {
    Queue<int[]> queue = new LinkedList<>();

    // 시작점 큐에 추가 및 방문 표시
    queue.offer(new int[]{startX,startY});
    visited[startX][startY] = true;

    // BFS 탐색 시작
    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int x = current[0];
      int y = current[1];

      // 4방향 탐색
      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        // 범위 내에 있고, 방문하지 않았으며, 물에 잠기기 않은 지점이라면
        if (nx>= 0 && nx < N && ny >=0 && ny < N && !visited[nx][ny]
        && map[nx][ny] > height) {

          queue.offer(new int[]{nx, ny});
          visited[nx][ny] = true;
        }
      }
    }

  }


}
