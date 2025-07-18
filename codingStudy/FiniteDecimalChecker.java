package codingStudy;

public class FiniteDecimalChecker {
  public int solution(int a, int b) {
    int gcd = gcd(a, b);
    b /= gcd;
    while (b % 2 == 0) b /= 2;
    while (b % 5 == 0) b /= 5;
    return b == 1 ? 1 : 2;
  }
  private int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

}
