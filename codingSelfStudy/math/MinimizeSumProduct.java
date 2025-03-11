package codingSelfStudy.math;

import java.util.*;

class MinimizeSumProduct {
  public int solution(int[] A, int[] B) {
    // 1. A는 오름차순 정렬
    Arrays.sort(A);
    // 2. B는 내림차순 정렬
    Arrays.sort(B);
    for (int i = 0; i < B.length / 2; i++) { // B를 뒤집음
      int temp = B[i];
      B[i] = B[B.length - 1 - i];
      B[B.length - 1 - i] = temp;
    }

    int sum = 0;
    // 3. 최솟값 구하기
    for (int i = 0; i < A.length; i++) {
      sum += A[i] * B[i];
    }

    return sum;
  }
}