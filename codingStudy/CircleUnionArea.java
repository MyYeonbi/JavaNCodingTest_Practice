package codingStudy;

public class CircleUnionArea {
  public int solution(int r1, int r2) {
    double area = Math.PI * (r1 * r1 + r2 * r2);
    return (int) area;
  }

}
