package codingStudy;

import java.util.*;

class SecretCodeBreaker {
  public int solution(int n, int[][] attempts) {
    List<int[]> combinations = generateCombinations(n, 5);
    int count = 0;

    for (int[] combo : combinations) {
      boolean valid = true;
      for (int[] attempt : attempts) {
        int[] guess = Arrays.copyOfRange(attempt, 0, 5);
        int expected = attempt[5];
        if (countMatch(combo, guess) != expected) {
          valid = false;
          break;
        }
      }
      if (valid) count++;
    }
    return count;
  }

  // 가능한 5개 숫자 조합 생성 (nC5)
  private List<int[]> generateCombinations(int n, int r) {
    List<int[]> result = new ArrayList<>();
    combine(result, new int[r], 1, n, 0);
    return result;
  }

  private void combine(List<int[]> result, int[] temp, int start, int n, int depth) {
    if (depth == temp.length) {
      result.add(temp.clone());
      return;
    }
    for (int i = start; i <= n - (temp.length - depth) + 1; i++) {
      temp[depth] = i;
      combine(result, temp, i + 1, n, depth + 1);
    }
  }

  // 두 배열 간 교집합 개수 세기
  private int countMatch(int[] a, int[] b) {
    Set<Integer> setA = new HashSet<>();
    for (int num : a) setA.add(num);
    int match = 0;
    for (int num : b) if (setA.contains(num)) match++;
    return match;
  }
}