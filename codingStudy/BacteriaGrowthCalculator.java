package codingStudy;

public class BacteriaGrowthCalculator {
  class Solution {
    public int solution(int n, int t) {
      return n * (int)Math.pow(2, t);
    }
  }

  class Solution1 {
    public int solution(int n, int t) {
      for (int i = 0; i < t; i++) {
        n *= 2;
      }
      return n;
    }
  }

}
