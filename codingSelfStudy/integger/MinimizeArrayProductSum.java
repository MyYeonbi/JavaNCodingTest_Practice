package codingSelfStudy.integger;

import java.util.Arrays;
import java.util.Collections;

public class MinimizeArrayProductSum {
    public int solution(int[] A, int[] B) {
        // 배열 A를 오름차순 정렬
        Arrays.sort(A);

        // 배열 B를 내림차순으로 정렬
        Integer[] BInteger = Arrays.stream(B).boxed().toArray(Integer[] :: new);
        Arrays.sort(BInteger, Collections.reverseOrder());

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            //A의 작은 값 * B의 큰 값
            answer += A[i] * BInteger[i];
        }
        return answer;
    }
}
