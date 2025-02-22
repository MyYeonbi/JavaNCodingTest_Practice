package codingSelfStudy.bfs;
import java.util.LinkedList;
import java.util.Queue;

public class GameMapNavigator {
 public int solution(int[][] maps) {
     int n = maps.length;
     int m = maps[0].length;
     boolean[][] visited = new boolean[n][m];
     int[] dx = {-1, 1, 0, 0}; //상하좌우 이동
     int[] dy = {0, 0, -1, 1};

     Queue<int[]> queue = new LinkedList<>();
     queue.add(new int[]{0, 0, 1}); //시작점 (0,0)과 거리1
     visited[0][0] = true;

     while (!queue.isEmpty()) {
         int[] current = queue.poll();
         int x = current[0];
         int y = current[1];
         int distance = current[2];

         // 목적지 도달 시 거리 반환
         if (x == n -1 && y == m -1) {
             return distance;
         }

         // 상하좌우로 이동
         for (int i = 0; i < 4; i++) {
             int nx = x + dx[i];
             int ny = y + dy[i];

             // 맵 범위 내에 있고, 방문하지 않았으며, 이동 가능한 곳일 때
             if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && maps[nx][ny] == 1) {
                 queue.add(new int[]{nx, ny, distance +1});
                 visited[nx][ny] = true;
             }
         }


     }
     // 목적지에 도달할 수 없는 경우
     return -1;
 }
}
