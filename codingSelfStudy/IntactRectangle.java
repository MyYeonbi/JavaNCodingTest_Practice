package codingSelfStudy;

class IntactRectangle {
  // 최대공약수(GCD) 계산 함수
  private int gcd(int a, int b) {
    while (b != 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }

  public long solution(int w, int h) {
    // 최대공약수 계산
    int gcdValue = gcd(w, h);

    // 멀쩡한 사각형 개수 계산
    long totalSquares = (long) w * h;
    long cutSquares = w + h - gcdValue;

    return totalSquares - cutSquares;
  }
}
