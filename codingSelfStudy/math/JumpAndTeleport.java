package codingSelfStudy.math;

class JumpAndTeleport {
  public int solution(int n) {
    int ans = 0;

    while (n > 0) {
      // n을 2로 나눈 나머지가 1이면 점프 횟수 증가
      if (n % 2 == 1) {
        ans++;
      }
      // 순간 이동을 위해 n을 2로 나눔
      n /= 2;
    }

    return ans;
  }
}
