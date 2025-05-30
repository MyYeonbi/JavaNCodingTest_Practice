package codingStudy;

public class SumUntilExceedN {
  public int solution(int[] num_list, int n) {
    int sum = 0;
    for (int num : num_list) {
      sum += num;
      if (sum > n) {
        return sum;
      }
    }
    return sum;
  }

}
