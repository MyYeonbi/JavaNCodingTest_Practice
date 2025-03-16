package codingSelfStudy.math;

import java.util.HashSet;
import java.util.Set;

class CircularSequence {
  public int solution(int[] elements) {
    Set<Integer> sums = new HashSet<>();
    int n = elements.length;

    // 원형 수열을 처리하기 위해 배열을 두 번 이어붙임
    int[] extendedElements = new int[n * 2];
    for (int i = 0; i < n; i++) {
      extendedElements[i] = elements[i];
      extendedElements[i + n] = elements[i];
    }

    // 모든 가능한 부분 수열의 합을 계산
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < i + n; j++) {
        sum += extendedElements[j];
        sums.add(sum);
      }
    }

    return sums.size();
  }
}