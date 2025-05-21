package codingStudy;

public class IntegerToStringConverter {
  class Solution1 {
    public String solution(int n) {
      return String.valueOf(n);
    }
  }

  class Solution2 {
    public String solution(int n) {
      return Integer.toString(n);
    }
  }

  class Solution3 {
    public String solution(int n) {
      return "" + n;
    }
  }

}
