package codingStudy.dfsBfs.bfs;

import java.util.*;
public class Robot {
  static int N, M;
  static int[][] map;
  static boolean[][] cleaned;

  // 북동남서(시계 반대 방향으로 탐색하기 위해 )
  static int[] dx = {-1,0,1,0};
  static int[] dy = {0,1,0,-1};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt(); //행
    M = sc.nextInt(); //열

    int r = sc.nextInt(); // 로봇 시작 위치 x
    int c = sc.nextInt(); // 로봇 시작 위치 y
    int d = sc.nextInt(); // 방향 북0, 동1, 남2, 서3

    map = new int [N][M];
    cleaned = new boolean[N][M];

    // 지도 입력
    for (int i = 0; i <N ; i++) {
      for (int j = 0; j <M ; j++) {
        map[i][j] = sc.nextInt();
      }
    }
    int count =0;

    while(true) {
      //1. 현재 칸이 아직 청소되지 않은 경우, 현재 칸 청소
      if (!cleaned[r][c]) {
        cleaned[r][c] = true;
        count++;
      }

      boolean moved = false;

      // 2. 주변 4칸 탐색 (왼쪽부터 시계 반대 방향으로 회전)
      for (int i = 0; i < 4; i++){
        d = (d + 3) % 4; //반시계 방향으로 회전(왼쪽 )
        int nx = r + dx[d];
        int ny = c + dy[d];

        if (nx >= 0  && nx < N && ny >= 0 && ny <M &&
        map[nx][ny] == 0 && !cleaned[nx][ny]) {
          r = nx;
          c = ny;
          moved = true;
          break;
        }
      }
      // 3. 네 방향 모두 청소되어 있거나 벽인 경우 -> 후진
      if (!moved) {
        int back = (d + 2) % 4; // 현재 방향의 뒤
        int nx = r + dx[back];
        int ny = c + dy[back];

        // 뒤가 벽이면 종료

        if(nx < 0 || nx >= N || ny < 0 || ny >= M || map[nx][ny] == 1){
          break;
        }

        //후진
        r = nx;
        c = ny;
      }
    }

    System.out.println(count);
  }

}
