package codingStudy.list;

import java.util.Arrays;

public class MinMix {
  public int solution(int[] A, int[] B) {
    int answer = 0;

    Arrays.sort(A); // A는 오름차순 정렬
    Arrays.sort(B); // B도 정렬 후 뒤에서부터 사용할 거야

    int N = A.length;
    for (int i = 0; i < N; i++) {
      answer += A[i] * B[N - 1 - i]; // A는 앞에서, B는 뒤에서부터 곱해
    }

    return answer;
  }
}
