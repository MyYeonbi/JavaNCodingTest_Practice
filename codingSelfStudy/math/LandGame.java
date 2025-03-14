package codingSelfStudy.math;

class LandGame {
  int solution(int[][] land) {
    int n = land.length;

    // DP 테이블 초기화
    int[][] dp = new int[n][4];
    for (int i = 0; i < 4; i++) {
      dp[0][i] = land[0][i];
    }

    // DP 테이블 채우기
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < 4; j++) {
        // 이전 행에서 같은 열을 제외한 최대 점수 찾기
        int maxPrev = 0;
        for (int k = 0; k < 4; k++) {
          if (k != j) {
            maxPrev = Math.max(maxPrev, dp[i - 1][k]);
          }
        }
        // 현재 행의 점수 계산
        dp[i][j] = land[i][j] + maxPrev;
      }
    }

    // 마지막 행에서의 최대 점수 반환
    int maxScore = 0;
    for (int i = 0; i < 4; i++) {
      maxScore = Math.max(maxScore, dp[n - 1][i]);
    }

    return maxScore;
  }
}