package codingSelfStudy.math;

class TournamentBracket {
  public int solution(int n, int a, int b) {
    int round = 0;

    // 두 참가자의 번호가 같아질 때까지 반복
    while (a != b) {
      a = (a + 1) / 2; // 참가자 A의 다음 라운드 번호
      b = (b + 1) / 2; // 참가자 B의 다음 라운드 번호
      round++; // 라운드 수 증가
    }

    return round;
  }
}